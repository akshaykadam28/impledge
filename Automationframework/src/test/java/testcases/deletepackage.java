package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class deletepackage extends BaseTest {
	@Test

	public static void Test1() throws InterruptedException {
		 

		    driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("kloudship.qa.automation@mailinator.com");
	        
	        driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Password1");
	        
	        driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
	         Thread.sleep(2000);
		    
	        // go to package 
	        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-home/div/div[2]/mat-card[8]")).click();

	        //delete the package
	        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-dashboard/div/div[1]/app-package-type-list/perfect-scrollbar/div/div[1]/mat-card[1]/div[2]/mat-icon")).click();
	        
	        //logout from account	        
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'more_vert')]")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[5]")).click();
	        
	        System.out.println("Package deleted successfully");
}
}


