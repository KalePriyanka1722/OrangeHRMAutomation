package cyberSuccess.Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.OrangeHrmPages.loginPage;

import cyberSuccess.cst39.BaseClass;

public class OrangeHRMFileUpload extends BaseClass{
	
	loginPage loginpage;
	
	@BeforeClass
	public void beforeClass() {
		
		driver=getBrowserInstance("Chrome");
		loginpage= new loginPage();
		
	}
	
  @Test
  public void login() throws InterruptedException {
	  
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  
		
		  loginpage.username.sendKeys("Admin");
		  
		  driver.findElement(loginpage.password).sendKeys("admin123");
		  
		  driver.findElement(loginpage.loginButton).click();
		  
		  driver.findElement(loginpage.myInfoMenu).click();
		  
		  // driver.findElement(loginpage.profileImg).click();
		  
		  // driver.findElement(By.id("photofile")).click(); // Thread.sleep(1000);
		  
		  // driver.findElement(By.xpath("//input[@id=\"photofile\"]")).click();
		  driver.findElement(By.linkText("Contact Details")).click();
		  
		  driver.findElement(By.id("btnAddAttachment")).click();
		  
		 
	  	driver.findElement(By.id("addBtn")).click();
		 
	  	Thread.sleep(1000);
	  
	  try {
		Runtime.getRuntime().exec("D:\\AutoItScript\\FileUploadScript.exe"+" "+"D:\\sample.java");
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
}
