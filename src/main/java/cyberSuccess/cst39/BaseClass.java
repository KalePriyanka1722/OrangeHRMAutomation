package cyberSuccess.cst39;

import javax.annotation.Nonnull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

//import com.google.common.base.Objects;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver getBrowserInstance(String bname) {

		switch (bname) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		default:
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;

		}
	}

	public void selectValueFromDropdown(@Nonnull WebElement element, int index, String value, String text) {
		Select select = new Select(element);
		// Select select=new Select(element);
		if (index > 0) {
			select.selectByIndex(index);
		} else if (Objects.nonNull(value)) {

			select.selectByValue(value);
		} else if (Objects.nonNull(value)) {
			select.selectByVisibleText(text);
		}

	}

	/*
	 * public String generateRandomString(long lenght) { int minValue = 77; int
	 * maxValue = 122; Random random = new Random(); return random.ints(minValue,
	 * maxValue).limit(lenght) .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append).toString();
	 * 
	 * }
	 */

	/*
	 * public String generateRandomEmailid(String domain) { return
	 * generateRandomString(4) + "@" + domain + ".com"; }
	 */

	public void deselectValueFromDropdown(@Nonnull WebElement element, int index, String value, String text) {

		Select select = new Select(element);
		if (index > 0) {
			select.deselectByIndex(index);
		} else if (Objects.nonNull(value)) {

			select.deselectByValue(value);
		} else if (Objects.nonNull(value)) {
			select.deselectByVisibleText(text);
		} else {
			select.deselectAll();
		}

	}

	public static ChromeOptions setCapabilityforChrome() {
		ChromeOptions profile = new ChromeOptions();
		profile.addArguments("start-maximized");
		profile.addArguments("--disable-notifications");
		profile.addArguments("Incognito");
		return profile;

	}

	/*
	 * public static void takeScreenShot(String methodName) throws IOException {
	 * TakesScreenshot screenShote = (TakesScreenshot) driver; File file =
	 * screenShote.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(file, new
	 * File("C:\\Users\\User\\eclipse-workspace\\cst39\\ScreenShote" + methodName +
	 * "")); }
	 */
}
