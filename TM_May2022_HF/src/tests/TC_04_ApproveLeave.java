package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.AddEmployee_HRM;
import pages.AddEntitlements_HRM;
import pages.ApplyLeave_HRM;
import pages.ApproveLeavePage_HRM;
import pages.DashboardPage_HRM;
import pages.TestClass;

public class TC_04_ApproveLeave extends DriverClass{
	
	@Test
	public void TC101_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		ApproveLeavePage_HRM apl = PageFactory.initElements(driver, ApproveLeavePage_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();
		
		dp.leaveModule();
		dp.leaveList();
		
		apl.leaveActions(data[8], data[15]);
		
		Thread.sleep(8000);

	}
	
	@Test
	public void TC102_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		ApproveLeavePage_HRM apl = PageFactory.initElements(driver, ApproveLeavePage_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
				
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();
		
		dp.leaveModule();
		dp.leaveList();
		
		apl.leaveActions(data[8], data[15]);
		
		Thread.sleep(8000);
		
	}
	
	@Test
	public void TC103_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		ApproveLeavePage_HRM apl = PageFactory.initElements(driver, ApproveLeavePage_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();
		
		dp.leaveModule();
		dp.leaveList();
		
		apl.leaveActions(data[8], data[15]);
		
		Thread.sleep(8000);
	}

}
