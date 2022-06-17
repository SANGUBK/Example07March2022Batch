package com.sgtesting.pageobjectmodelpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPomAssignDemo7 {
	public static WebDriver oBrowser=null;
	public static ActiTimepage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		 nevigate();
		 login();
		 minimizeFlyOutWindow();
		 createcustomer(); 
		 createProject();
		 createTask();
		 //deleteTask();
		 deleteProject();
		 deletecustomer();
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
	private static void createcustomer()
	{
		try
		{
			oPage.getTaskbutton().click();
			oPage.getAddNew().click();
			oPage.getNewCustomer().click();
			Thread.sleep(2000);
			oPage.getEnterCustomerName().sendKeys("DemoCustomer");
			oPage.getCreateCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
		    oPage.getAddNew().click();
		    Thread.sleep(1000);
		    oPage.getCreateNewProject().click();
		    Thread.sleep(1000);
		    oPage.getEnterProjectName().sendKeys("DemoProject");
		    oPage.getcreateProjectbutton().click();
		    Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createTask()
	{
		try
		{
		  oPage.getAddNewTask().click();
		  Thread.sleep(1000);
		  oPage.getCreateNewTasks().click();
		  Thread.sleep(2000);
		  oPage.getEnterTaskName().sendKeys("Demo Task");
		  Thread.sleep(1000);
		  oPage.getCreateTasks().click();
		  Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteTask()
	{
		try
		{
		  oPage.getTaskCheckBox().click();
		  Thread.sleep(2000);
		  oPage.getDeleteTask().click();
		  Thread.sleep(1000);
		  oPage.getDeleteTaskPermanently().click();
		  Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oPage.getDPSetting().click();
			Thread.sleep(1000);
			oPage.getActionDP().click();
			Thread.sleep(1000);
			oPage.getDPDelete().click();
			oPage.getdeletePermanentlyProject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			oPage.getDCSetting().click();
			Thread.sleep(1000);
			oPage.getActionDC().click();
			oPage.getdeleteCustomer().click();
			oPage.getdeteletpermanentlyCustomer().click();
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
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
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
