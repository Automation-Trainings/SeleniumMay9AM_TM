package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.AddEmployee_HRM;
import pages.AddEntitlements_HRM;
import pages.DashboardPage_HRM;
import pages.TestClass;

public class TC_05_AddEmployee extends DriverClass{
	
	@Test
	public void TC101_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		AddEmployee_HRM ae = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();
		
		dp.pimModule();
		dp.addemployee();
		
		ae.UserFirstName(data[3]);
		ae.UserLastName(data[4]);
		ae.uploadFileUser();
		ae.checkBoxClick();
		ae.UserName(data[5]);
		ae.Password(data[6]);
		ae.RePassword(data[7]);
		ae.submitBtnClick();
		Thread.sleep(8000);		
		
	}
	
	@Test
	public void TC102_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		AddEmployee_HRM ae = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();
		
		dp.pimModule();
		dp.addemployee();
		
		ae.UserFirstName(data[3]);
		ae.UserLastName(data[4]);
		ae.uploadFileUser();
		ae.checkBoxClick();
		ae.UserName(data[5]);
		ae.Password(data[6]);
		ae.RePassword(data[7]);
		ae.submitBtnClick();
		Thread.sleep(8000);
	
	}
	
	@Test
	public void TC103_LoginPage() throws InterruptedException {		
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
		AddEmployee_HRM ae = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM aes = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();
		
		dp.pimModule();
		dp.addemployee();
		
		ae.UserFirstName(data[3]);
		ae.UserLastName(data[4]);
		ae.uploadFileUser();
		ae.checkBoxClick();
		ae.UserName(data[5]);
		ae.Password(data[6]);
		ae.RePassword(data[7]);
		ae.submitBtnClick();
		Thread.sleep(8000);		
		
	}

}
