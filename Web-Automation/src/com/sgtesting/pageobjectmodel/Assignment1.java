package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

		public static WebDriver oBrowser=null;
		public static ActiPage oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			CreateUser();
			deleteUser();
			Logout();
			closeApplication();
		}
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oPage=new ActiPage(oBrowser);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(4000);
			}catch(Exception e)
			{
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

		static void CreateUser()
		{
			try
			{
				oPage.getUserIcon().click();
				oPage.getAddUser().click();
				Thread.sleep(2000);
				oPage.getFirstName().sendKeys("user1");
				oPage.getLastName().sendKeys("demo1");
				oPage.getEmail().sendKeys("tn@gmail.com");
				oPage.getFirstName1().sendKeys("anu1");
				oPage.getUserPassWord().sendKeys("duo");
				oPage.getUserPassWordCopy().sendKeys("abcd");
				oPage.getUserCommitBtn().click();
				Thread.sleep(2000);
				oPage.getSecondTableContainer().click();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		static void deleteUser()
		{
			try
			{
				oPage.getSecondTableContainer().click();
				Thread.sleep(2000);
				oPage.getUserDeleteBtn().click();
				Thread.sleep(2000);
				Alert obj=oBrowser.switchTo().alert();
				obj.accept();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		
		static void Logout()
		{
			try
			{
				oPage.getLogout().click();
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}

