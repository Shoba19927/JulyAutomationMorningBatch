package com.sgtesting.tests;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CSSSelectorDemo {

		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			//	absoluteCSSSelector();
			//	relativeCSSWithTagName();
			//	relativeCSSWithTagNameAndIdAttributeValue();
			//	relativeCSSWithIdAttributeValue();
			//	relativeCSSWithTagNameAndClassAttributeValue();
			//	relativeCSSWithClassAttributeValue();
			//	relativeCSSWithTagNameAndAttributeNameAndValue();
			//	relativeCSSWithAttributeNameAndValue();
			//	relativeCSSWithTagNameAndMultipleAttributeNameAndValue();
			//	relativeCSSWithMultipleAttributeNameAndValue();
			//	relativeCSSWithTagNameAndAttributeName();
			//	relativeCSSWithPartialMatchingOfAttributeValue();
			//	relativeCSSWithParentReference();
			//	relativeCSSWithNthChildAppraoch();
			relativeCSSWithSiblingApproach();
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
				oBrowser.get("file:///G:/HTML/Sample.html");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		
		static void absoluteCSSSelector()
		{
			oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
		}


		static void relativeCSSWithTagName()
		{
			oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
		}
		

		static void relativeCSSWithTagNameAndIdAttributeValue()
		{
			oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
		}


		static void relativeCSSWithIdAttributeValue()
		{
			oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser1");
		}


		static void relativeCSSWithTagNameAndClassAttributeValue()
		{
			oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser1");
		}
		

		static void relativeCSSWithClassAttributeValue()
		{
			oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
		}
		

		static void relativeCSSWithTagNameAndAttributeNameAndValue()
		{
			oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
		}
		

		static void relativeCSSWithAttributeNameAndValue()
		{
			oBrowser.findElement(By.cssSelector("[value='Submit']")).click();
		}


		static void relativeCSSWithTagNameAndMultipleAttributeNameAndValue()
		{
			oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
		}


		static void relativeCSSWithMultipleAttributeNameAndValue()
		{
			oBrowser.findElement(By.cssSelector("[value='Submit'][name='submit1btn1']")).click();
		}


		static void relativeCSSWithTagNameAndAttributeName()
		{
			List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
			System.out.println("# of Links :"+olinks.size());

			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				System.out.println(link.getText());
			}

		}


		static void relativeCSSWithPartialMatchingOfAttributeValue()
		{
			oBrowser.findElement(By.cssSelector("input[id *='submit1']")).click();
		}


		static void relativeCSSWithParentReference()
		{
			oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
		}


		static void relativeCSSWithNthChildAppraoch()
		{
			oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(1)")).sendKeys("DemoUser1");
			oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser5");
		}


		static void relativeCSSWithSiblingApproach()
		{
			oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input")).sendKeys("DemoUser123");
		}

	}

