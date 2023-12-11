package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {

		try {
			FileInputStream fis = new FileInputStream(
					"F:\\Automation Project\\Software\\Automation_Framework\\src\\Config\\ConfigurationData.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void startTheBrowser() {

		String browswerName = prop.getProperty("broswerName");

		if (browswerName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Automation Project\\Software\\chromedriver-win64\\chromedriver.exe"); // set
																													// the
																													// broswer
																													// exe
																													// path
			driver = new ChromeDriver();
		} else {
			System.out.println("please enter correct name of the browser");
		}

		driver.get(prop.getProperty("https://www.facebook.com/"));
		driver.manage().window().maximize();
	}

}
