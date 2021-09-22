package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment4{
	
public static WebDriver oBrowser=null;
public static ActiPage oPage=null;
public static void main(String[] args) {
	launchBrowser();
	navigate();
	login();
	minimizeFlyOutWindow();
	createCustomer();
	modifyCustomer();
	deleteCustomer();
	logout();
	closeApplication();
}

static void launchBrowser()
{
	try {
		System.setProperty("webdriver.chrome.driver", "G:\\WelcomeAutomation\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage=new ActiPage(oBrowser);
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void navigate()
{
	try {
		oBrowser.get("http://localhost:82/login.do");
		Thread.sleep(8000);
		
	}catch(Exception e){
		e.printStackTrace();
	}
}

static void login()
{
	try
	{
		oPage.getUserName().sendKeys("admin");
		oPage.getPassword().sendKeys("manager");
		oPage.getLoginButton().click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void minimizeFlyOutWindow()
{
	try
	{
		oPage.getFlyOutWin().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void createCustomer()
{
	try
	{
		oPage.getTasksIcon().click();
		Thread.sleep(2000);
		oPage.getaddCustomerOrProject().click();
		Thread.sleep(2000);
		oPage.getNewCustomerOption().click();
		Thread.sleep(2000);
		oPage.getCustomerNameField().sendKeys("customer1");
		Thread.sleep(2000);
		oPage.getCustomerDescriptionField().sendKeys("cust1desp");
		Thread.sleep(2000);
		oPage.getCreateCustomerCommitButton().click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void modifyCustomer()
{
	try
	{
		oPage.getCustomerSettings().click();
		Thread.sleep(2000);
		oPage.getSelectCustomerNameField().click();
		Thread.sleep(2000);
		oPage.getCustomerNameFieldText().clear();
		oPage.getCustomerNameFieldText().sendKeys("cust1");
		Thread.sleep(2000);
		oPage.getCustomerSettingsClose().click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void deleteCustomer()
{
	try
	{
		oPage.getCustomerSettings().click();
		Thread.sleep(2000);
		oPage.getCustomerActionOption().click();
		Thread.sleep(2000);
		oPage.getCustomerDelete().click();
		Thread.sleep(2000);
		oPage.getCustomerDeleteConfirm().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}	
static void logout()
{
	try
	{
		oPage.getLogout().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void closeApplication()
{
	try
	{
		oBrowser.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

}

