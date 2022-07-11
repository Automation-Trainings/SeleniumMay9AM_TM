package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import libraries.WebLibrary;

public class ApproveLeavePage_HRM extends WebLibrary{
	
	//*[@id='resultTable']/tbody/tr[i]//option[text()='Reject']
	//*[@id='resultTable']/tbody/tr[i]/td[8]/select/option[text()='Reject']
	
	boolean status;	
	
	public void leaveActions(Object empNameExp, Object actionType) {
		
		WebElement element = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[1]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
		
		int rowCount = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		
		for(int i = 1; i <= rowCount; i++) {
			String empNameAct = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[2]")).getText();
			if(empNameAct.equals(empNameExp)) {
				WebElement ActionsType = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]//select"));
				status = selectByVisibleText(ActionsType, actionType);
				logEvent(status, "Action type selected " + actionType, "Action type not selected " + actionType);
				
			}
		}
		
	}
	
	

}
