package selenium_api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_CheckEnvironment {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		// Open browser
		driver = new FirefoxDriver();
		// Open app
		driver.get("http://live.guru99.com/");
		// Wait page load successfully
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Maximize browser fullscreen
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01() {
		// get current title
		String homePageTitle = driver.getTitle();
		// Verify acual title with expected title
		Assert.assertEquals("Home page", homePageTitle);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		// close browser
	}

}
