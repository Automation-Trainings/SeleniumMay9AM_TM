package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class TestClass extends WebLibrary{
	
	public TestClass () {
		launchApplication(BaseURL);
	}
	
	boolean status;
	
	@FindBy(id="logInPanelHeading")
	public WebElement loginLabel ;
	
	@FindBy(id="txtUsername") 
	public WebElement loginUserName ;
	
	@FindBy(xpath="//*[@id='txtPassword']")
	public WebElement loginPassword ;
	
	@FindBy(id="btnLogin") 
	public WebElement loginButton ;
	
	public void verifyLoginLabel(Object label) {
		status  = validateText(loginLabel, label);
		logEvent(status, "Label verified successfully", "Label not matching");
	}
	
	public void UserName(Object userName) {
		status = SetText(loginUserName, userName);
		logEvent(status, "User name entered successfully", "User name is not entered successfully");
	}
	
	public void Password(Object passWord) {
	status = SetText(loginPassword, passWord);
	logEvent(status, "Password entered successfully", "Password is not entered successfully");
	}
	
	public void ButtonLogin() {
		status = ClickElement(loginButton);
		logEvent(status, "Login button is clicked successfully", "Login button is not clicked successfully");
	}	
	
}
