package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.AddEntitlements_HRM;
import pages.ApplyLeave_HRM;
import pages.DashboardPage_HRM;
import pages.TestClass;

public class TC_06_ApplyLeave extends DriverClass{	
	
	@Test
	public void TC101_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		ApplyLeave_HRM apl = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[5]);
		tcs.Password(data[6]);
		tcs.ButtonLogin();
		
		dp.leaveModule();
		dp.applyLeaveTab();
		
		apl.leaveType(data[9]);
		apl.fromDate(data[13]);
		apl.toDate(data[14]);
		apl.leaveComment(data[15]);
		apl.clickSaveBtn();	
		
		Thread.sleep(8000);

	}
	
	@Test
	public void TC102_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		ApplyLeave_HRM apl = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
				
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[5]);
		tcs.Password(data[6]);
		tcs.ButtonLogin();
	
		dp.leaveModule();
		dp.applyLeaveTab();
		
		apl.leaveType(data[9]);
		apl.fromDate(data[13]);
		apl.toDate(data[14]);
		apl.leaveComment(data[15]);
		apl.clickSaveBtn();
		
		Thread.sleep(8000);
		
	}
	
	@Test
	public void TC103_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		ApplyLeave_HRM apl = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[5]);
		tcs.Password(data[6]);
		tcs.ButtonLogin();
		
		dp.leaveModule();
		dp.applyLeaveTab();
		
		apl.leaveType(data[9]);
		apl.fromDate(data[13]);
		apl.toDate(data[14]);
		apl.leaveComment(data[15]);
		apl.clickSaveBtn();	
		
		Thread.sleep(8000);
		
	}

}
