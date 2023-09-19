package Facebooksign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

 

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class facebooksign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Kausalya24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sathya@2010");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	  

}
