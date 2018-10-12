package com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//abhishek.bakshi//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com/");
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	//  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				// xpath syntax 
				  //tagname[@attribute='value'] take out double quote
				
				//Css syntax
		//		  tagname[attribute='value']
			//	driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[2]/a")).click();
			//	driver.findElement(By.xpath("//a[@value='GOI']")).click();
           //      driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
        //
                 //dropdowncode)
	                           driver.findElement(By.id("divpaxinfo")).click();
           //      Select dropdown = new Select(driver.findElement(By.id("divpaxinfo")));
                 Select dropdown = new Select(driver.findElement(By.cssSelector("label[class='clguestlbl']")));
                
                 dropdown.selectByIndex(2);
                 
                 
        
              //   driver.close();
				
				
				
	}

}
