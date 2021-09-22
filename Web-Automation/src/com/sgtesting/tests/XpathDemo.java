package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
		//	absoluteXPath();
		//	relativeXPathUsingTagNameAlone();
		//	relativeXPathUsingTagNameAndIndex();
		//	relativeXPathUsingTagNameWithAttributeNameValue();
		//	relativeXPathUsingTagNameWithMultipleAttributeNameValues();
		//	relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingAndOperator();
		//	relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingOrOperator();
		//	relativeXPathUsingAttributeNameValueCombination();
		//	relativeXPathUsingAttributeValueAlone();
		//	relativeXPathUsingTagNameAndAttributeNameAlone();
		//	relativeXPathUsingTagNameAndAttributeNameAlone2();
		//	relativeXPathUsingTagNameAndAttributeNameAlone3();
		//	relativeXPathUsingTagNameAndAttributeNameAlone4();
		//	relativeXPathUsingPartialAttributeValue();
		//	relativeXPathUsingTextContent();
			relativeXPathUsingPartialTextContent();
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
				oBrowser.get("D:\\Sample.html");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void absoluteXPath()
		{
			try
			{
				oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("demouser1");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	   static void relativeXPathUsingTagNameAlone()
	   {
		   try
		   {
			 oBrowser.findElement(By.xpath("//input")).sendKeys("demouser1");
			 Thread.sleep(2000);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameAndIndex()
	   {
		   try
		   {
			 oBrowser.findElement(By.xpath("//input[2]")).sendKeys("demouser2");  
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameWithAttributeNameValue()
	   {
		   try
		   {
			 oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
			 Thread.sleep(2000);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameWithMultipleAttributeNameValues()
	   {
		   try
		   {
			 oBrowser.findElement(By.xpath("//input[@value='Submit'][@class='submit1btn1']")).click();
			 Thread.sleep(2000);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingAndOperator()
	   {
		   try
		   {
			oBrowser.findElement(By.xpath("//input[@value='Submit' and @class='submit1btn1']")).click();
			Thread.sleep(2000);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingOrOperator()
	   {
		   try
		   {
			 oBrowser.findElement(By.xpath("//input[@value='Submit' or @class='submit1btn1']")).click();
			 Thread.sleep(2000);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingAttributeNameValueCombination()
	   {
		   try
		   {
			 oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
			 Thread.sleep(2000);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingAttributeValueAlone()
	   {
		   try
		   {
			 oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();  
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameAndAttributeNameAlone()
	   {
		   try
		   {
			   List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
				System.out.println("# of Links :"+olinks.size());
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameAndAttributeNameAlone2()
		{
			try
			{
				List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
				System.out.println("# of Links :"+olinks.size());
				for(WebElement link:olinks)
				{
					String name=link.getText();
					System.out.println(name);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	   
	   static void relativeXPathUsingTagNameAndAttributeNameAlone3()
	   {
		   try
		   {
			   List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
				System.out.println("# of Links :"+olinks.size());
				for(WebElement link:olinks)
				{
					String name=link.getText();
					if(name.endsWith("Insitute"))
					{
						link.click();
						break;
					}
				}
				Thread.sleep(2000);
				oBrowser.navigate().back();  
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingTagNameAndAttributeNameAlone4()
	   {
		   try
		   {
			   List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
				System.out.println("# of Links :"+olinks.size());
				for(int i=0;i<olinks.size();i++)
				{
					WebElement link=olinks.get(i);
					String name=link.getText();
					if(name.startsWith("Ecl"))
					{
						link.click();
					}
				}  
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   static void relativeXPathUsingPartialAttributeValue()
		{
			try
			{
			//	oBrowser.findElement(By.xpath("//input[contains(@id,'windows')]")).click();
				oBrowser.findElement(By.xpath("//input[starts-with(@id,'rad2')]")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void relativeXPathUsingTextContent()
		{
			try
			{
				String link="Eclipse";
				oBrowser.findElement(By.xpath("//a[text()='"+link+"']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void relativeXPathUsingPartialTextContent()
		{
			try
			{
				oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
}
