package com.sgtesting.dataproviderassignments;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment2 {

		public static WebDriver oBrowser=null;
		public static Logger log=Logger.getLogger("Loop Output");
		
		@Test(priority=1)
		public void launchBrowser() {
			try {
				log.info("AssignmentTestng2");
				
				System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser= new ChromeDriver();
				log.info("launchBrowser() method executed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test(priority=2)
		public void navigate() {
			try {
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(4000);
				log.info("navigate() method executed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test(priority=3)
		public void login() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(4000);
				log.info("login() method executed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test(priority=4)
		public void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=5,dataProvider="createUserInput")
		public void createUser(String fn,String ln,String email,String un,String pwd,String pwdCopy)
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys(fn);
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys(ln);
				Thread.sleep(2000);
				oBrowser.findElement(By.name("email")).sendKeys(email);
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys(un);
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys(pwd);
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdCopy);
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(4000);
				log.info("createUser() method executed");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=6,dataProvider="modifyUserInput")
		public void modifyUser(String fn,String ln)
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys(fn);
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys(ln);
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(4000);
				log.info("modifyUser() method executed");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=7)
		public void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert obj=oBrowser.switchTo().alert();
				obj.accept();
				Thread.sleep(4000);
				log.info("deleteUser() method executed");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=8)
		public void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				log.info("logout() method executed");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=9)
		public void closeApplication()
		{
			try {
				oBrowser.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		@DataProvider
		public Object[][] createUserInput()
		{
			return new Object[][] {{"demo","User1","demo@gmail.com","demoUser1","Welcome1","Welcome1"}};
		}
		
		@DataProvider
		public Object[][] modifyUserInput()
		{
			return new Object[][] {{"demooo","User11"}};
		}

	}


