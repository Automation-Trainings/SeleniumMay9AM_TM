package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.LoginPage_HRM;

public class TC01_VerifyLoginPage extends DriverClass {	
	
	@Test
	public void TC_01_VerifyLoginPage() {
		Object[] data = ReadRowData(CurrentTestCaseName);		
		//Pagefactory
		LoginPage_HRM loginpage = PageFactory.initElements(driver, LoginPage_HRM.class);
		loginpage.VerifyTextLabel(data[2]);
		loginpage.UserName(data[0]);
		loginpage.Password(data[1]);
		loginpage.Login();
	}

}
