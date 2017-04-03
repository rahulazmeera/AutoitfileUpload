package fileHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GamilInvoking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("rahul.gandhi484@gmail.com");
		
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("Deva@1993");
	    driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id=':j3']/div/div")).click();
	    //driver.switchTo().alert().accept();
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    driver.findElement(By.className("J-J5-Ji J-Z-I-J6-H")).click();
	    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   // driver.findElement(By.cssSelector("#:qs")).click();
		/*WebElement element=driver.findElement(By.id(""));
		Point point=element.getLocation();
		System.out.println(point.x+point.y);*/
		
		
		
		
		
		
		
		
	}

}
