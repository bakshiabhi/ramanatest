package com.Automation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//abhishek.bakshi//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	
	//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",\\input[@type='button']);
		//Thread.sleep(500); 
	
		//tagname[@attribute='value']  - \\input[@type='button']
		 /*
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("window.scrollBy(0,6000)"); 
            Thread.sleep(3000);
		*/
	WebElement element=	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[1]/a")).click();
		driver.switchTo().alert().accept();
		
		
		

	
	}}


	
