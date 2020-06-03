package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://website.com/sign-in/");
		driver.manage().window().maximize();
		
  }
 
  @Test
  public void verify() {
		
			// TODO Auto-generated method stub
	  String x = driver.getTitle();
			System.out.println(x);
			Assert.assertEquals(x,x);
  }
  
  @Test
  
  public void verify1() {
		
		// TODO Auto-generated method stub
	  String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,"kush");
  
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
