package cyberSuccess.cst39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmetods extends BaseClass
{

	public static void main(String[] args)
	{
		Actionmetods am=new Actionmetods();
		WebDriver driver=am.getBrowserInstance("Chrome");
		driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        Actions action=new Actions(driver);
        action.click(driver.findElement(By.xpath("//a[text()=\"Login\"]"))).build().perform();
	}

}
