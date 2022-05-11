package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseFolder.DriverScript;

public class TasksPage extends DriverScript {
	
	public TasksPage() {
		PageFactory.initElements(driver, this);
	}
//***********Page locators starts from Here *********************

	@FindBy(id="username") WebElement tbUsername;
	@FindBy(name="pwd") WebElement tbPassword;
	@FindBy(xpath="//div[text()='Login ']") WebElement btnlogin;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actitimeLogo;
	@FindBy(xpath="//a[@class='content tasks']") WebElement tasksLink;
	@FindBy(xpath="//div[@class='addNewButton']") WebElement btnAddnewtask;
	@FindBy(xpath="//div[text()='+ New Customer']") WebElement btnAddNewCustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement tbCustomerName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement tbDescription;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement btnCreateCustomer;
	@FindBy(id="logoutLink") WebElement linkLogOut;
	
	
	//***********Page Methods *********************	
	
	
public void enterUserName(String Username) {
		
		try {
			tbUsername.clear();
			tbUsername.sendKeys(Username);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterPassword(String password) {
		try {
		tbPassword.clear();
		tbPassword.sendKeys(password);
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickLogin() {
		try {
		btnlogin.click();
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickTasksLink() {
		try {
		tasksLink.click();
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickAddNewTaskLink() {
		try {
			btnAddnewtask.click();
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickAddNewCustomerLink() {
		try {
			btnAddNewCustomer.click();
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public void enterCustomeName(String customerName) {
		
		try {
			
			Thread.sleep(5000);
			tbCustomerName.clear();
			tbCustomerName.sendKeys(customerName);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public void enterDescription(String description) {
	
	try {
		tbDescription.clear();
		tbDescription.sendKeys(description);
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void clickCreateCustomerLink() {
	try {
		btnCreateCustomer.click();
	Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void clickLogoutLink() {
	try {
		linkLogOut.click();
	Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
}
