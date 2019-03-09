package orgorg;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AlertDropDownFileUploadHandling {

	@Test
	public void test1()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/official/Selenium_Classes/FileUpload.html");
		WebElement ele=driver.findElement(By.tagName("select"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
		
		  driver.findElement(By.tagName("button")).click();
		  Alert le=driver.switchTo().alert();
			 
		  String ale=driver.switchTo().alert().getText();
		  System.out.println(ale);
		  driver.switchTo().alert().accept(); 
		  //driver.switchTo().alert().dismiss();
		  
		  
		  driver.findElement(By.id("upload")).
		  sendKeys("C:\\Users\\My Pc\\eclipse-workspace\\org\\test.png");
		 
	}
}
