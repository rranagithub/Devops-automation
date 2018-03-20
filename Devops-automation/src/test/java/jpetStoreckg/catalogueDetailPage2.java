package jpetStoreckg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class catalogueDetailPage2 extends BaseTest {
	

	
	@Test
	public void Tc4() throws IOException
	{
		BaseTest.invokeBrowser();		
		/*driver = new FirefoxDriver();
		driver.get("http://10.1.23.186:9080/jpetstore/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);*/
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='SidebarContent']/a[2]/img")).click();
		
		String expectedText = driver.findElement(By.xpath(".//*[@id='Catalog']/h2")).getText();
		
		String actualText = "Dogs";
		
		if(expectedText.equals(actualText))
		{
			
			System.out.println("Dogs Catalogue Details page loaded successfully");
			
		}	
		BaseTest.closeBrowser();
	

	}

}
