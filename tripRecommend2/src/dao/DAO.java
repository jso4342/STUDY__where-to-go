package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import vo.VO;

public class DAO {
	//매개변수로 추천도시를 받아서 결과값 리턴해주는 메소드 
//	당신에게 어울리는 추천여행지는 ‘ DESTINATION ‘ 입니다.
//	DESTINATION 근처의 축제로는  'FESTIVAL' 가(이) 유명하며, 
//	액티비티는 'ACTIVITY'를(을) 추천드립니다. 추천 음식으로는 'FOOD'가(이) 유명하니 꼭 먹어보세요.
//	 * 1. String getDbData(String destination){
//		 * 		destination 을 변수로 받아 PK가 destination 인 DB 의 row 를 찾아
//		 * 		우리가 리턴하려는 문자열에 넣어주기
	   //DB와 연결한 객체
	   Connection conn;
	   //작성한 SQL문을 저장하고, 관리하고, 실행
	   PreparedStatement pstm;
	   //SQL문의 결과를 담아주는 객체
	   ResultSet rs;
	   
	   private WebDriver driver;
	      private String url;
	      
	      public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	      public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
	      
	
	   
	   public String getDbData(String destination) {
		      String destiNation ="";
		      String festival = "";
		      String activity="";
		      String food="";
		      String answer="";
		      String query="SELECT DESTINATION, FESTIVAL, ACTIVITY, FOOD FROM TRAVEL WHERE DESTINATION=?";
		      try {
		         conn=DBConnecter.getConnection();
		  
		         pstm=conn.prepareStatement(query);
		         pstm.setString(1, destination);

		         rs=pstm.executeQuery();
		         //행가져오기 
		         rs.next();
		         
		         destiNation=rs.getString(1);    //Destination
		         festival = rs.getString(2);      //Festival
		         activity=rs.getString(3);      //activity
		         food=rs.getString(4);      //food
		         
		         answer ="✈ 당신에게 어울리는 추천 여행지는 "+destination+" 입니다 ✈\n\n"+
		        		 		destination+" 근처의 축제로는 "+festival+"가(이) 유명하며, \n액티비티는 " +
		        		 		activity+"를 추천드립니다.\n"+"추천 음식으로는 "+food+"가(이) 유명하니 꼭 먹어보세요!";
		      } catch (SQLException e) {
		         System.out.println("getDbData() SQL오류");
		      }finally {
		         
		          try {
		                  if(rs != null) {
		                     rs.close();
		                  }
		                  if(pstm != null) {
		                     pstm.close();
		                  }
		                  if(conn != null) {
		                     conn.close();
		                  }
		               } catch (SQLException e) {
		            	   throw new RuntimeException(e.getMessage());
		                
		               }
		            }
		            return answer;
		      
		      
		   }

	   public void naverFlight(String destination, String inMonth, String outMonth, String inDay, String outDay) {

	         //드라이버 설정
	         System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
	         
	         //브라우저 옵션
	         ChromeOptions options = new ChromeOptions();
	         driver = new ChromeDriver(options);
	         url = "https://flight.naver.com";
	         driver.get(url);
	         

	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         driver.findElement(By.className("end")).click();
	         //도착 버튼 클래스명 end 임 주의하기.
	         
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         driver.findElement(By.className("autocomplete_input__1vVkF")).sendKeys(destination);
	         //destination 입력하기.
	         
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         try {
	         driver.findElement(By.className("autocomplete_location__TDL6g")).click();
	         //destination을 주고 나면 목록이 자동완성 된다. 그 후 첫번째 태그 클릭
	         
//	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//	         driver.findElement(By.className("searchBox_txt__3RoCw")).click(); //검색 버튼 클릭
	         
//	         달력버튼
	         
	         driver.findElement(By.className("select_Date__1aF7Y")).click();
	         
	//
//	      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//	      
//	      //달력 (월)
	         
	         List<WebElement> month = driver.findElements(By.cssSelector("div.sc-kEqXSa"));
	         List<WebElement> days = month.get(Integer.parseInt(inMonth)-1).findElements(By.cssSelector("b.sc-dIsUp"));
	         // 달을 찾고 그 달 안에 days 를 담은 것 
	         
	         //가는날
	         days.get(Integer.parseInt(inDay)-1).click();
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         //오는날
	         List<WebElement> days2 = month.get(Integer.parseInt(outMonth)-1).findElements(By.cssSelector("b.sc-dIsUp"));
	         days2.get(Integer.parseInt(outDay)-1).click();
	         
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         
	         driver.findElement(By.className("searchBox_txt__3RoCw")).click(); //검색 버튼 클릭
	         try {Thread.sleep(10000);} catch (InterruptedException e) {;}
	         int count =0;
	         int check =0;
	         List<WebElement> datas = driver.findElements(By.cssSelector("div.result div.itemSchedule"));
	         // 항공권 정보 (항공사, 시간 등) 
	         List<WebElement> dataP = driver.findElements(By.cssSelector("div.result div.item_ItemPriceList__22YBo div.item_fare__3YGTI"));
	         // 가격 
	         for (int i = 0; i < 5; i++) {
	            try {
	               System.out.println("\n----------"+ ++count+"번 항공권----------\n"+datas.get(i).getText() + "\n" + "가격: " + dataP.get(i).getText());
	            } catch (Exception e) {
	            	check = 1;
	               continue;
	            }
	         }
	         if (check == 1) {
	        	  System.out.println("가져올 항공권이 없습니다.");
	         }
	        	 
	         
	      } catch (Exception e1) {
	         System.out.println("가져올 값이 없습니다.");
	           driver.close();
	              driver.quit();
	      }   

	         driver.close();
	         driver.quit();
	      }


	    public void koreaPackage(int num) {
	       
	       System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
	        
	        //브라우저 옵션
	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("headless");
	        driver = new ChromeDriver(options);
	        url = "https://pkgtour.naver.com/";
	        driver.get(url);
	        
	        try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	        driver.findElement(By.className("daytrip")).click();
	        
	        try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	        driver.findElement(By.cssSelector("div.SearchBox button.search")).click();
	        try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	        driver.findElement(By.cssSelector("div.multiple button.button")).click(); // 지역 선택
	        try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	        List<WebElement>li = driver.findElements(By.cssSelector("ul.list")); // 지욕이 리스트로 있음 

	        //:nth-child() 안 번호를 매개변수로 값 받아오면 됨 
	      li.get(0).findElement(By.cssSelector("li.item:nth-child("+(num+1)+")")).click();
	      
	        
	        
	        
	        try {Thread.sleep(1000);} catch (InterruptedException e) {;}  
	        List<WebElement> items = driver.findElements(By.cssSelector("ul.list div.info"));
	        List<WebElement> itemsName = driver.findElements(By.cssSelector("ul.list div.info b.name"));
	        List<WebElement> itemsSchedule = driver.findElements(By.cssSelector("ul.list div.info div.options"));
	        List<WebElement> itemsPrice = driver.findElements(By.cssSelector("ul.list div.info div.price strong.value"));
	        List<WebElement> url = driver.findElements(By.cssSelector("div.product a.anchor"));
	        int count = 0;
	        int check = 0;
	        for(int i=0; i<5; i++) {
	            try {          
	               System.out.println("\n----------"+ ++count+"번 패키지----------\n"+ itemsName.get(i).getText()
	                     + "\n" + "여행 날짜: " + itemsSchedule.get(i).getText() + "\n" + "가격: " + itemsPrice.get(i).getText() 
	                     + "\n" + "여행 예약하기 : " + url.get(i).getAttribute("href") + "\n" + "비행기는 제외된 가격입니다!"
	                     );
	            } catch (Exception e) {
	            	check = 1;
	                break;
	             }
	           
	        }
	        if (check == 1) {
	        	System.out.println("해당 기간 내에 여행 패키지가 없습니다.");
	        }
	        driver.close();
	        driver.quit();
	    }
	   
	   

	    public void naverPackage (String destination, String inMonth, String outMonth, String inDay, String outDay) {

	          //드라이버 설정
	          System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
	         
	         //브라우저 옵션
	          ChromeOptions options = new ChromeOptions();
	      	LocalDate now = LocalDate.now();
	      	int monthValue = now.getMonthValue();
//	         options.addArguments("headless");
	         driver = new ChromeDriver(options);
	         url = "https://pkgtour.naver.com";
	         driver.get(url);
	         
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         driver.findElement(By.className("toggle")).click();      
	         //여행지 클릭
	        
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         driver.findElement(By.className("button")).click();        
	         //해외여행 클릭
	        
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         driver.findElement(By.className("query")).sendKeys(destination);  
	         //여행지 칸에 destination값 입력
	         
	         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	         driver.findElement(By.cssSelector("ul.results :first-child")).click();            //여행지 선택
	         //퍼스트 차일드 이용해서 첫번째 자동완성 클릭
	            try {
	            
	            try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	            driver.findElement(By.cssSelector("div.date button.toggle")).click();
	            //달력 클릭
	          
	            
	            for (int i = 0; i <Integer.parseInt(inMonth)-monthValue; i++) {
	               driver.findElement(By.className("next")).click();
	            }//항공권과 다르게 달이 넘어가면 넘어가는 버튼을 클릭해야한다. 사용자가 입력한 값에 -1 만큼 next 클릭해주기.
	          
	            List<WebElement> list=driver.findElements(By.className("sc-dlnjwi"));
	          // 월 
	            List<WebElement> days = driver.findElements(By.cssSelector("b.sc-fujyAs"));
	          // 일 
	            try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	            days.get(Integer.parseInt(inDay)-1).click();
	            //가는 날 클릭
	            
	            try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	            if(Integer.parseInt(inMonth) < Integer.parseInt(outMonth)) {
	                driver.findElement(By.className("next")).click();
	            }
	             try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	             List<WebElement> days2 = driver.findElements(By.cssSelector("b.sc-fujyAs"));
	             days2.get(Integer.parseInt(outDay)-1).click();
	             //오는 날 클릭
	             
	             try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	             driver.findElement(By.cssSelector("div.sub button.submit")).click();
	             //날짜 선택후 적용 버튼
	             
	             try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	             driver.findElement(By.cssSelector("div.SearchBox button.search")).click();
	             //패키지 검색 버튼
	             
	             try {Thread.sleep(1000);} catch (InterruptedException e) {;}  
	             List<WebElement> items = driver.findElements(By.cssSelector("ul.list div.info"));
	             List<WebElement> itemsName = driver.findElements(By.cssSelector("ul.list div.info b.name"));
	          //   List<WebElement> itemsAir = driver.findElements(By.cssSelector("ul.list div.info div.flight:not(i)"));
	             List<WebElement> itemsSchedule = driver.findElements(By.cssSelector("ul.list div.info div.schedule"));
	             List<WebElement> itemsPrice = driver.findElements(By.cssSelector("ul.list div.info div.price strong.value"));
	             List<WebElement> url = driver.findElements(By.cssSelector("div.product a.anchor"));
	             //크롤링 할 항목을 추려서 List에 담아준다.
	             
	             int count = 0;
	             int check = 0;
	             for(int i=0; i<5; i++) {
	                 try {
	                    System.out.println("\n----------"+ ++count+"번 패키지----------\n" + itemsName.get(i).getText()  /*+ "\n" +*/ /*"비행기: " + itemsAir.get(i).getText()*/
	                          + "\n" + "여행 날짜 : " + itemsSchedule.get(i).getText() + "\n" + "가격 : " + itemsPrice.get(i).getText() + "\n" + "여행 예약하기: " + url.get(i).getAttribute("href")
	                          );
	                    
	                    //list에 담긴 항목을 적당히 배치해서 출력해준다.
	                 } catch (Exception e) {
	                	 check = 1;
	                    continue;
	                 }
	              }
                 if(check == 1) {
                    System.out.println("해당 기간 내 패키지가 없습니다.");
                 }
	            }catch (Exception e1) {
	            System.out.println("해당 기간 내 패키지가 없습니다.");
	          //  driver.close();
	           // driver.quit();
	       }   //트라이캐치로 묶어주기
	         
	         driver.close();
	        driver.quit();
	       }
	       
	     
	    public void extraService(int choice, String destination) {
	    	
	    	 Corona co = new Corona();
	    	 String destiNation ="";
	    	 String tour = "";
	    	 String airport="";
	    	 String nation2="";
	    	 
	    	 String query="SELECT DESTINATION, AIRPORT, TOUR, NATION2 FROM TRAVEL WHERE DESTINATION=?";

				
				try {
				   conn=DBConnecter.getConnection();
				
				   pstm=conn.prepareStatement(query);
				   pstm.setString(1, destination);
				
				   rs=pstm.executeQuery();
				   //행가져오기 
				   if(rs.next()) {
				 
				   
				   destiNation=rs.getString(1);    //Destination
				   airport = rs.getString(2);      //airport
				   tour=rs.getString(3);      //tour 
				   nation2 = rs.getString(4);		//nation2
				   }
				  
				} catch (SQLException e) {
//					e.printStackTrace();
				   System.out.println("getDbData() SQL오류");
				}finally {
				   
				    try {
				            if(rs != null) {
				               rs.close();
				            }
				            if(pstm != null) {
				               pstm.close();
				            }
				            if(conn != null) {
				               conn.close();
				            }
				         } catch (SQLException e) {
				      	   throw new RuntimeException(e.getMessage());
				          
				         }
				      }
	    	 
	    	  VO vo = new VO();
	    	  String hi = "\n~최저가 항공 조회하기 ~";
	    	  String hi2="\n~패키지 여행 조회하기 ~";
	      	 String dayin ="※출국날과 입국날은 31일 이상차이가 나면 안됩니다 \n출국하실 년, 월, 일을 입력해주세요 ex)2022 03 01 ";
	      	 String dayout ="입국하실 년, 월, 일을 입력해주세요 ex)2022 03 30";
	         
	    	 if (choice == 1) { //최저가 항공 조회하기 
                 // 입출국 날짜  입력 받기 
           	   Scanner sc2 = new Scanner(System.in);
                	 System.out.println(hi);
                	 System.out.println(dayin);
                	 // 사용자가 입력하는 값 (전역변수로 선언함)
                	vo.setInDate(sc2.nextLine());
                	 
                	 System.out.println(dayout);
                	vo.setOutDate(sc2.nextLine());
                	if(vo.getInDate()!=null || vo.getOutDate()!=null) { 
                	String[] inResult = vo.getInDate().split(" ");
                  vo.setInMonth( inResult[1]); // 가는 월 
                   vo.setInDay(inResult[2]); // 가는 일 
                   String[] outResult = vo.getOutDate().split(" ");
                   vo.setOutMonth(outResult[1]);  // 오는 월
                   vo.setOutDay(outResult[2]); // 오는 일 
                   
                
                   naverFlight(airport, vo.getInMonth(), vo.getOutMonth(), vo.getInDay(), vo.getOutDay());
                   		
                	}
            
              }
              if(choice==2) {
           	   Scanner sc2 = new Scanner(System.in);
              	 System.out.println(hi2);
              	 System.out.println(dayin);
              	 // 사용자가 입력하는 값 (전역변수로 선언함)
              	vo.setInDate(sc2.nextLine());
              	 
              	 System.out.println(dayout);
              	vo.setOutDate(sc2.nextLine());
              	if(vo.getInDate()!=null || vo.getOutDate()!=null) { 
              	String[] inResult = vo.getInDate().split(" ");
                vo.setInMonth( inResult[1]); // 가는 월 
                 vo.setInDay(inResult[2]); // 가는 일 
                 String[] outResult = vo.getOutDate().split(" ");
                 vo.setOutMonth(outResult[1]);  // 오는 월
                 vo.setOutDay(outResult[2]); // 오는 일 
           	   
           	   
           	  
           	   naverPackage(tour, vo.getInMonth(), vo.getOutMonth(), vo.getInDay(), vo.getOutDay());
              }
           }
              
              if (choice == 3) {// 코로나 지침 확인하기 
           	   co.corona(nation2); 
           	    
                }
             
                  
	    }

	 }






