package learn.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateToUrl {

	@Test
	public void navigateToUrl(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopab\\workSapceNew\\automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Testcase completed");
	}
	
	

}
