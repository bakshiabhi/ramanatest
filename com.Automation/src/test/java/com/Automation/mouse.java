package com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//abhishek.bakshi//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.uk");
		Actions a = new Actions(driver);
		WebElement rightclick = driver.findElement(By.id("glow-ingress-line2"));
		a.moveToElement(rightclick).contextClick().build().perform();
	
	
	

}}
