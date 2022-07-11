package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class AddEntitlements_HRM extends WebLibrary{
	
	boolean status;
	
	@FindBy(xpath="//*[text()='Add Leave Entitlement']") 
	public WebElement AddLeaveEntitlementHeader;
	
	@FindBy(id="entitlements_employee_empName")
	public WebElement AddEntitlementEmpName;
	
	@FindBy(id="entitlements_leave_type")
	public WebElement AddEntitlementLeaveType;
	
	@FindBy(id="entitlements_entitlement")
	public WebElement AddEntitlement;
	
	@FindBy(id="btnSave")
	public WebElement AddEntitlementBtnSave;
	
	public void AddLeaveEntitlementHeader(Object headerText) {
		status = validateText(AddLeaveEntitlementHeader, headerText);
		logEvent(status, "Add Leave Entitlement Header is matching", "Add Leave Entitlement Header is not matching");
	}
	
	public void AddEntitlementEmpName(Object empNameText) {
		status = SetTextAndEnter(AddEntitlementEmpName, empNameText);
		logEvent(status, "Add Entitlement EmpName is entered", "Add Entitlement EmpName is not entered");
	}
	
	public void AddEntitlementLeaveType(Object leaveType) {		
		status = selectByVisibleText(AddEntitlementLeaveType, leaveType);
		logEvent(status, "Add Entitlement LeaveType is selected", "Add Entitlement LeaveType is not selected");
	}
	
	public void AddEntitlement(Object entitlements) {
		status = SetText(AddEntitlement, entitlements);
		logEvent(status, "Entitlements is added", "Entitlements is not added");
	}
	
	public void addEntitlementsSaveBtn() {
		status = ClickElement(AddEntitlementBtnSave);
		logEvent(status, "AddEntitlements save btn click is successfull", "AddEntitlements save btn click is not successfull");
	}

}
