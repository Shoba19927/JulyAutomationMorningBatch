package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo {
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			withoutWebElement();
		}
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser=new ChromeDriver();
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
		
		static void withoutWebElement()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
				Thread.sleep(1000);
				oBrowser.findElement(By.id("username")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
				Thread.sleep(1000);
				oBrowser.findElement(By.id("username")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
				Thread.sleep(1000);
				oBrowser.findElement(By.id("username")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("username")).sendKeys("demoUser123");
				Thread.sleep(1000);
				String str=oBrowser.findElement(By.id("username")).getAttribute("value");
				System.out.println(str);
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}


		