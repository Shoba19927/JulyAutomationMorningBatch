package com.sgtesting.reflectiondemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReflectionAssignment1 {

		
		public static WebDriver oBrowser=null;
	/*	public static void main(String[] args) {

//			launchBrowser();
//			navigate();
//			login();
//			minimizeFlyOutWindow();
//			createUser();
//			modifyUser();
//			deleteUser();
//			logout();
//			closeApplication();
//		}*/
		
		public void launchBrowser() {
			try {
				System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser= new ChromeDriver();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void navigate() {
			try {
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(4000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void login() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(4000);
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		public void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				oBrowser.findElement(By.name("firstName")).sendKeys("demo");
				oBrowser.findElement(By.name("lastName")).sendKeys("User1");
				oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(4000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void modifyUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.name("firstName")).clear();
				oBrowser.findElement(By.name("firstName")).sendKeys("demooo");
				Thread.sleep(3000);
				oBrowser.findElement(By.name("lastName")).clear();
				oBrowser.findElement(By.name("lastName")).sendKeys("User11");
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(8000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void closeApplication()
		{
			try {
				oBrowser.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}


