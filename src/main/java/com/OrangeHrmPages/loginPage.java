package com.OrangeHrmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cyberSuccess.cst39.BaseClass;

public class loginPage extends BaseClass {
	
//	public By username=By.id("txtUsername");
	
	public By password=By.id("txtPassword");
	
	public By loginButton=By.id("btnLogin");
	
	public By myInfoMenu=By.id("menu_pim_viewMyDetails");
	
	public By profileImg=By.id("empPic");
	
	public By chooseFileButton=By.id("photofile");
	@FindBy(id="txtUsername")
	public WebElement username;

	public loginPage() {
		
		PageFactory.initElements(driver,this );
	}

}
