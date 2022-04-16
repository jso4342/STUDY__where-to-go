package dao;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona implements Runnable{
	
   private WebDriver driver;
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
   
   public static void corona(String nation) {
	   Corona corona = new Corona();
	   String url = "https://kr.trip.com/travel-restrictions-covid-19/";
	   
	   //운영체제에 드라이버 설정
	   System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
	   
	   //ChromeDriver를 driver에 담아주기
	   corona.setDriver(new ChromeDriver());
	   corona.getDriver().get(url);
	   
	   //팝업 감지 쓰레드 실행
	   new Thread(corona).start();
	   try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	   
	   //사용자가 검색하고자 하는 나라 입력
	   corona.getDriver().findElement(By.cssSelector("div.to-box div.search-content input.inputsearch-input")).sendKeys(nation);
	   try {Thread.sleep(1000);} catch (InterruptedException e) {;}
	   
	   //입력된 나라에 대한 페이지로 이동
	   corona.getDriver().findElement(By.cssSelector("div.datalist-content ul:first-child")).click();
	   try {Thread.sleep(5000);} catch (InterruptedException e) {;}
	   
	  List<WebElement>co = corona.getDriver().findElements(By.cssSelector("div.policy-detail:last-child div.fs2 div:first-child"));
//	  System.out.println("코로나 지침 상세규정 \n"+co.get(124).getText());
	  String result = "";
	  int count = 0;
	     for (WebElement we: co) {
	    	 
	    	 count++;
	    	 if (we.getText().isEmpty()) {;}
	    	 else {
	    		result = we.getText(); 
	    		// getText 가 빈 방이 아닌 방의 텍스트 (상세규정) 을 가져오기
	    		break;
	    	 }
	    	 
	   }
	
	     // 상세규정을 참고하여 한 줄당 60글자, 한 문단당 7줄
	     System.out.println("~~~~~~~코로나 상세규정~~~~~~~~~\n");
	  count = 0;
	  int count2 = 0;
	  result = result.replaceAll("\n", " ");
	  for (int i = 0 ; i < result.length(); i++) {
		  System.out.print(result.charAt(i));	
		  count++;
		  count2++;
		  if (count == 60) {
			  System.out.print("\n");
			  count = 0;
		  }
		  if (count2 == 420) {
			  System.out.println("\n");
			  count2 = 0;
		  }
	  }
	   //크롬 종료
	   corona.getDriver().close();
	   corona.getDriver().quit();
	   System.exit(0);
	  
   }
   @Override
   public void run() {
	   while(true) {
		   try {
			   //팝업창 가져옴
			   WebElement div = getDriver().findElement(By.cssSelector("div.sc-1e79edz-0"));
			   //위에서 오류 발생 시 팝업이 없다는 얘기, 팝업이 뜨면 여기 밑으로 내려옴
			   
			   //javascript 써야해서 객체 준비
			   JavascriptExecutor js = (JavascriptExecutor) getDriver();
			   //팝업이 떳다면 해당 태그의 display를 none으로 변경
			   js.executeScript("arguments[0].style.display='none';", div);
			   //1초마다 팝업창 떳는 지 검사
			   try {Thread.sleep(1000);} catch (Exception e) {;}
		   } catch (Exception e) {}
	   }
   }
public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
  

}






