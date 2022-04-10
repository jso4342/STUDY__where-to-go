 private WebDriver driver;
   private String url;
import java.util.List;
   
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
   


   public NaverFlight() {
      //드라이버 설정
      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
      
      //브라우저 옵션
      ChromeOptions options = new ChromeOptions();
      options.addArguments("headless");
      driver = new ChromeDriver(options);
      url = "https://flight.naver.com/";
      driver.get(url);
   }
   

 public void operate() {
	searchFlight();
      driver.close();
      driver.quit();
   }

  public void searchFlight() {

// 사용자가 입력하는 값
String inDate = “”;
String outDate = “”;

// 입력 값에서 가는 날의 월과 일 추출 
String inMonth = “”;
String inDay = “”;

// 입력 값에서 오는 날의 월과 일 추출 
String outMonth = “”;
String outDay = “”;




	// 항공권을 찾아주는 메소드  
 Scanner sc = new Scanner(System.in);
System.out.print("가는 날을 입력해주세요.\n 예)2022 01 01\n : ");

inDate = sc.next(); // 가는 날이 저장 됨 
System.out.print("오는 날을 입력해주세요. \n 예)2022 01 01\n : ");
OutDate = sc.next(); // 오는 날이 저장 됨
2022.11.11 > split 으로 분류 후 month, date string 에 저장 


String[] inResult = inDate.split(" ");
	inMonth = inResult[1]; // 가는 월 
	inDay = inResult[2]; // 가는 일 
String[] outResult = outDate.split(" ");
	outMonth = outResult[1];  // 오는 월
	outDay = outResult[2]; // 오는 일 
				
		
		


/*
도착지 클릭 ->


*/
 


}


   public NaverPackage() {
      //드라이버 설정
      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
      
      //브라우저 옵션
      ChromeOptions options = new ChromeOptions();
      options.addArguments("headless");
      driver = new ChromeDriver(options);
      url = "https://www.melon.com/";
      driver.get(url);
   }
   






 String getFlightSchedule(String destination) {
						// 출국 날짜 	   	입국 날짜 
    	  
    	  // 년 , 월 , 일 
    	  // 점으로 구분해서 받고 365 단위니까 1년 이후 거를 입력 -> 에러 
    	  // 




      }



