package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class RegistrationPage extends BaseClass {
		
		@FindBy(name="//input[@name=\"firstname\"]")
		private WebElement Fname;
		
		@FindBy(name="//input[@name=\"lastname\"]")
		private WebElement lname;
		
		@FindBy(name="//input[@name=\"reg_email__\"]")
		private WebElement UserId;
		
		@FindBy(name="//input[@id=\"password_step_input\"]")
		private WebElement Pass;
		
		@FindBy(xpath="//button[@name='websubmit']")
		private WebElement SignUp;
		
		public RegistrationPage() {
			
			PageFactory.initElements(driver, this);
		
	}
		public boolean validatePage() {
			
			return driver.getCurrentUrl().contains("accounts");
		}
}
