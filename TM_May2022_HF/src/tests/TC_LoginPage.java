package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import baseClass.DriverClass;
import pages.AddEmployee_HRM;
import pages.AddEntitlements_HRM;
import pages.DashboardPage_HRM;
import pages.TestClass;

public class TC_LoginPage extends DriverClass{
	
	@Test
	public void TC100_LoginPage() throws InterruptedException {		
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
		
		dp.leaveModule();
		dp.entitlements();
		dp.addEntitlements();
		
		aes.AddLeaveEntitlementHeader(data[11]);
		aes.AddEntitlementEmpName(data[8]);
		aes.AddEntitlementLeaveType(data[9]);
		aes.AddEntitlement(data[10]);
		aes.addEntitlementsSaveBtn();
		Thread.sleep(8000);
		
	}

}
