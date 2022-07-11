package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class DashboardPage_HRM extends WebLibrary{
	
	boolean status;
	
	@FindBy(id="menu_pim_viewPimModule") 
	public WebElement pimModule;
	
	@FindBy(id="menu_pim_addEmployee") 
	public WebElement addEmployeeBtn;	
	
	@FindBy(id="menu_leave_viewLeaveModule") 
	public WebElement leaveModule;
	
	@FindBy(id="menu_leave_Entitlements") 
	public WebElement Entitlements;
	
	@FindBy(id="menu_leave_addLeaveEntitlement") 
	public WebElement AddEntitlements;
	
	@FindBy(id="menu_leave_viewLeaveList")
	public WebElement leaveList;
	
	@FindBy(id = "menu_leave_applyLeave")
	public WebElement appLeave;
	
	public void applyLeaveTab() {
		status = ClickElement(appLeave);
		logEvent(status, "Click on Apply Leave is successful", "Click on Apply Leave is not successful");
	}
	
	public void leaveList() {
		status = ClickElement(leaveList);
		logEvent(status, "leave List click is successfull", "leave List click is not successfull");
	}
	
	public void pimModule() {
		status = moveToElement(pimModule);
		logEvent(status, "pimModule Mouseover is successfull", "pimModule Mouseover is not successfull");
	}
	
	public void addemployee() {
		status = ClickElement(addEmployeeBtn);
		logEvent(status, "Add employee click is successfull", "Add employee click is not successfull");
	}
	
	public void leaveModule() {
		status = moveToElement(leaveModule);
		logEvent(status, "leaveModule Mouseover is successfull", "leaveModule Mouseover is not successfull");
	}
	
	public void entitlements() {
		status = moveToElement(Entitlements);
		logEvent(status, "Entitlements Mouseover is successfull", "Entitlements Mouseover is not successfull");
	}
	
	public void addEntitlements() {
		status = ClickElement(AddEntitlements);
		logEvent(status, "AddEntitlements click is successfull", "AddEntitlements click is not successfull");
	}
	

}
