package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void verify() {
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://website.com/sign-in/");
			driver.manage().window().maximize();
			String x = driver.getTitle();
			System.out.println(x);
			Assert.assertEquals(x,x);
  }
  
  @Test
  
  public void verify1() {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://website.com/sign-in/");
		driver.manage().window().maximize();
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,"kush");
}
  
}
