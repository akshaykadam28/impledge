package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Addpackage extends BaseTest  {
	
	@Test

	public static void Test1() throws InterruptedException {
		 

		    driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("kloudship.qa.automation@mailinator.com");
	        
	        driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Password1");
	        
	        driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
	         Thread.sleep(2000);
	   
	        // go to package 
	        driver.findElement(By.xpath("//body/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-home[1]/div[1]/div[2]/mat-card[8]")).click();
	       
	        // add package
	        driver.findElement(By.xpath("//app-header/mat-toolbar[1]/button[2]/span[1]/mat-icon[1]")).click();
	        Thread.sleep(2000);
	        //add details	        
	        driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("FirstName LastName");
	        
	        driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys("15");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("10");
	        
	        driver.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("12");
	        
	        driver.findElement(By.xpath("//mat-icon[normalize-space()='check']")).click();
	        Thread.sleep(2000);
	        //logout from account
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'more_vert')]")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[5]")).click();
	        driver.quit();
	        System.out.println("New package added successfully");
	        
	        
	}
}
