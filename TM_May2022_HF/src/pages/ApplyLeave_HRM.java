package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class ApplyLeave_HRM extends WebLibrary{
	
	boolean status;
	
	@FindBy(id = "applyleave_txtLeaveType")
	public WebElement leaveType;
	
	@FindBy(id = "applyleave_txtFromDate")
	public WebElement fromDate;
	
	@FindBy(id = "applyleave_txtToDate")
	public WebElement toDate;
	
	@FindBy(id = "applyleave_txtComment")
	public WebElement leaveComment;
	
	@FindBy(id = "applyBtn")
	public WebElement applyBtn;
	
	public void clickSaveBtn() {
		status = ClickElement(applyBtn);
		logEvent(status, "Save button is clicked successfully", "Save button is not clicked successfully");
	}
	
	public void leaveType(Object leaveType) {
		status = selectByVisibleText(this.leaveType, leaveType);
		logEvent(status, "Leave type select is successfull", "Leave type select is not successfull");
	}
	
	public void fromDate(Object firstName) {
		status = SetTextAndEscape(fromDate, firstName);
		logEvent(status, "From date entered successfully", "From date is not entered successfully");
	}
	
	public void toDate(Object firstName) {
		status = SetTextAndEscape(toDate, firstName);
		logEvent(status, "To date entered successfully", "To date is not entered successfully");
	}
	
	public void leaveComment(Object leaveComment) {
		status = SetText(this.leaveComment, leaveComment);
		logEvent(status, "Leave comment entered successfully", "Leave comment is not entered successfully");
	}	

}
