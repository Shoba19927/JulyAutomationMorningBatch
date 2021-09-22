package com.sgtesting.dataproviderassignments;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment6 {

		public static WebDriver oBrowser=null;
		public static Logger log=Logger.getLogger("Loop Output");
		
		@Test(priority=1)
		public void launchBrowser() {
			try {
				System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser= new ChromeDriver();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test(priority=2)
		public void navigate() {
			try {
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(5000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test(priority=3,dataProvider = "getLoginData")
		public void login(String un,String pwd)
		{
			try {
				oBrowser.findElement(By.id("username")).sendKeys(un);
				oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(5000);
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
		
		@Test(priority=5,dataProvider = "getCustomerData")
		public void createCustomer(String name,String desp)
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(name);
				Thread.sleep(2000);
				oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(desp);
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		@Test(priority=6,dataProvider = "getProjectData")
		public void createProject(String name,String desp)
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(name);
				Thread.sleep(2000);
				oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys(desp);
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=7,dataProvider = "getModifyProjectData")
		public void modifyProject(String name)
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")).click();
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).clear();
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).sendKeys(name);
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		@Test(priority=8)
		public void deleteProject()
		{
			try
			{
				
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[1]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(3000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		@Test(priority=9)
		public void deleteCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=9)
		public void logout()
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
		
		@Test(priority=10)
		public void closeApplication()
		{
			try {
				oBrowser.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		@DataProvider
		public Object[][] getLoginData()
		{
			return new Object[][] {{"admin","manager"}};
		}
		
		@DataProvider
		public Object[][] getCustomerData()
		{
			return new Object[][] {{"customer1","cust1desp"}};
		}
		
		@DataProvider
		public Object[][] getProjectData()
		{
			return new Object[][] {{"project1","cust1proj1"}};
		}
		
		@DataProvider
		public Object[][] getModifyProjectData()
		{
			return new Object[][] {{"project11"}};
		}

	}


