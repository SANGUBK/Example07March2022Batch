package com.sgtesting.pageobjectmodelpom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPomAssignDemo2 {
	public static WebDriver oBrowser=null;
	public static ActiTimepage oPage=null;
	public static void main(String[] args) {
		 launchBrowser();
		 nevigate();
		 login();
		 minimizeFlyOutWindow();
		 createuser(); 
		 modifyuser();
		 deleteuser();
		 logout();
		 closeapplication();

	}
	
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oPage=new ActiTimepage(oBrowser);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
		private static void nevigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try
			{
				oPage.getUserName().sendKeys("admin");
				Thread.sleep(2000);
				oPage.getpassward().sendKeys("manager");
				Thread.sleep(2000);
				oPage.getLogin().click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void minimizeFlyOutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createuser() 
		{
			try
			{
			
		oPage.getUser().click();
		oPage.getAdduser().click();
		Thread.sleep(1000);
		oPage.getFirstname().sendKeys("Demo");
		oPage.getLastname().sendKeys("user1");
		oPage.getEmail().sendKeys("demouser1@gmail.com");
		oPage.getUsername().sendKeys("DemoUser1");
		oPage.getcreatePassword().sendKeys("Welcome123");
		oPage.getretypePassword().sendKeys("Welcome123");
		oPage.getCreateUser().click();
		Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}

       }
		private static void modifyuser()
		{
			try
			{
				oPage.getclickUser1().click();
				Thread.sleep(1000);
				oPage.getcreatePassword().sendKeys("demouser1");
				oPage.getretypePassword().sendKeys("demouser1");
				oPage.getsaveChanges().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteuser()
		{
			try
			{
				oPage.getclickUser1().click();
				Thread.sleep(1000);
				oPage.getdeleteUser().click();
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
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
		private static void  closeapplication()
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
