package orgorg;

import java.io.File;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class Test1 {

	//@SuppressWarnings("deprecation")
	@Test(retryAnalyzer=Retry.class)
	public void st()
	{
		
		/*
		 * WebDriver driver= new ChromeDriver();
		 * driver.get("http://www.rediffmail.com"); driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//div[@class='divicon']")).click(); String
		 * common="//form/div";
		 * driver.findElement(By.xpath("//input[contains(@id,'log')]")).sendKeys("name")
		 * ; driver.findElement(By.xpath(common+"//div[4]/input")).sendKeys("pass");
		 * List<WebElement> listOfElements=driver.findElements(By.tagName("a"));
		 * System.out.println(listOfElements.size());
		 * driver.findElement(By.linkText("Forgot Password?")).click();
		 * driver.navigate().back();
		 * driver.findElement(By.partialLinkText("Forgot")).click(); TakesScreenshot
		 * shot= ((TakesScreenshot)driver); File file =
		 * shot.getScreenshotAs(OutputType.FILE); File dest=new
		 * File("C:\\Users\\My Pc\\eclipse-workspace\\org\\test.png");
		 * Utils.copyFile(file, dest);
		 */
		Assert.assertEquals(true, false);
		
		
		 
		
		
	}
}
