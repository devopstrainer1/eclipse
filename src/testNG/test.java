package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {

  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://34.69.158.37:32768/addressbook/");
		driver.manage().window().maximize();
		
  }
 
  @Test
  public void verify() {
		
			// TODO Auto-generated method stub
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("edureka451");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("selenium");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("123456");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("tes41t@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("06/11/1986");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
  }
  
  
  @AfterMethod
  public void afterMethod() {
	//  driver.close();
  }

}

