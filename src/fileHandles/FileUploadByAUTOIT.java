package fileHandles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadByAUTOIT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://searchenginereports.net/plagiarism-checker/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='file']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("C:\\Users\\azmeera rahul\\Desktop\\pics.exe");
	
		

	}

}
