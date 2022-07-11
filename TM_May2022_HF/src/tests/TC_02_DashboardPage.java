package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.AddEmployee_HRM;
import pages.DashboardPage_HRM;
import pages.TestClass;

public class TC_02_DashboardPage extends DriverClass{
	
	@Test
	public void TC02_DashboardPage() {
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
//		AddEmployee_HRM ae = PageFactory.initElements(driver, AddEmployee_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();
		
		dp.pimModule();
		dp.addemployee();
	}
	
	@Test
	public void TC03_DashboardPage() {
		Object[] data = ReadRowData(CurrentTestCaseName);
		TestClass tcs = PageFactory.initElements(driver, TestClass.class);
//		DashboardPage_HRM dp = PageFactory.initElements(driver, DashboardPage_HRM.class);
//		AddEmployee_HRM ae = PageFactory.initElements(driver, AddEmployee_HRM.class);
		
		tcs.verifyLoginLabel(data[2]);
		tcs.UserName(data[0]);
		tcs.Password(data[1]);
		tcs.ButtonLogin();		
	}

}
