package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class AddEmployee_HRM extends WebLibrary {

	boolean status;

	@FindBy(id = "firstName")
	public WebElement userFirstname;

	@FindBy(id = "lastName")
	public WebElement userLastname;

	@FindBy(id = "photofile")
	public WebElement fileUpload;

	@FindBy(name = "chkLogin")
	public WebElement chkLogin;

	@FindBy(name = "user_name")
	public WebElement userName;

	@FindBy(name = "user_password")
	public WebElement userPassword;

	@FindBy(name = "re_password")
	public WebElement re_password;

	@FindBy(id = "btnSave")
	public WebElement btnSave;

	public void UserFirstName(Object firstName) {
		status = SetText(userFirstname, firstName);
		logEvent(status, "First name is entered", "First name is not entered");
	}

	public void UserLastName(Object lastName) {
		status = SetText(userLastname, lastName);
		logEvent(status, "Last name is entered", "Last name is not entered");
	}

	public void uploadFileUser() {
		String path = "C:\\Users\\hp\\eclipse-workspace\\TM_May2022_HF\\TestData\\CollectionsFramework.png";
		status = fileUpload(fileUpload, path);
		logEvent(status, "File uploaded", "File is not uploaded");
	}

	public void checkBoxClick() {
		status = ClickElement(chkLogin);
		logEvent(status, "Check box is clicked", "Check box is not clicked");
	}
	
	public void UserName(Object username) {
		status = SetText(userName, username);
		logEvent(status, "User name is entered", "User name is not entered");
	}

	public void Password(Object password) {
		status = SetText(userPassword, password);
		logEvent(status, "Password is entered", "Password is not entered");
	}
	
	public void RePassword(Object repassword) {
		status = SetText(re_password, repassword);
		logEvent(status, "Re-Password is entered", "Re-Password is not entered");
	}
	
	public void submitBtnClick() {
		status = ClickElement(btnSave);
		logEvent(status, "Submit button is clicked", "Submit button is not clicked");
	}	
	
}
