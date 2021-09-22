package com.sgtesting.tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	launchBrowser();
	navigate();
	login();
	minimizeFlyOutWindow();
	createUser1();
    logout();
	loginUser1();
	createUser2();
	logout();
	loginUser2();
	createUser3();
	logout();
	loginUser3();
	logout();
	loginUser2();
	modifyUser3();
	logout();
	loginUser3();
	logout();
	loginUser1();
	modifyUser2();
	logout();
	loginUser2();
	logout();
	login();
	modifyUser1();
	logout();
	loginUser1();
	logout();
	loginUser2();
	deleteUser3();
	logout();
	loginUser1();
	deleteUser2();
	logout();
	login();
	deleteUser1();
	logout();
	closeApplication();
}
		
		
		static void launchBrowser() {
			try {
				System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser= new ChromeDriver();
				Thread.sleep(3000);
				oBrowser.manage().window().maximize();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void navigate() {
			try {
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(5000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void login() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(5000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void minimizeFlyOutWindow()
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
		
		static void createUser1()
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
		
		static void createUser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
				oBrowser.findElement(By.name("lastName")).sendKeys("User2");
				oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome2");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void createUser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
				oBrowser.findElement(By.name("lastName")).sendKeys("User3");
				oBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome3");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
				oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		static void loginUser1() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void loginUser11() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void loginUser2() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();

			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void loginUser22() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void loginUser3() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome3");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void modifyUser1() {
			try {
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome11");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome11");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(5000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void modifyUser2() {
			try {
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome22");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome22");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(5000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		static void modifyUser3() {
			try {
				
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);	
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome33");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome33");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(5000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void loginUser111() {
			try {
				Thread.sleep(3000);
				oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome11");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void loginUser222() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome22");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void loginUser333() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
				oBrowser.findElement(By.name("pwd")).sendKeys("Welcome33");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(8000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void deleteUser1()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
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
			
		static void deleteUser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
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

			
			
		static void deleteUser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
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
		
		static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void closeApplication()
		{
			try {
				oBrowser.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}


