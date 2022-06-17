package com.sgtesting.objectmap;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssignomp2 {

	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			filename="D:\\SeleniumAutomation\\Automation\\Web-Automation\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void navigate()
	{
		try
		{
			
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
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

	private static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("adduserbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userfirstname")).sendKeys("demo");
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("User1");
			oBrowser.findElement(objectmap.getLocator("useremailid")).sendKeys("demouser1@gmail.com");
			oBrowser.findElement(objectmap.getLocator("userusername")).sendKeys("demoUser1");
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("Welcome123");
			oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("Welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectuserbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("demouser1");
			oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("usersavebutton")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectuserbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userdeletenutton")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



	
