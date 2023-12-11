package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass {

	LoginPage lp;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		startTheBrowser();
		lp = new LoginPage();
	}

	@Test
	public void validateLogin() {
		Assert.assertTrue(lp.validatepage());
	}

	@Test
	public void checkLoginFuncitonality() {
		Assert.assertTrue(lp.validateLogin());
	}

}
