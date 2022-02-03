package cyberSuccess.cst39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAss extends BaseClass
{

	public static void main(String[] args) throws InterruptedException
	{
		Actionmetods am=new Actionmetods();
		WebDriver driver=am.getBrowserInstance("Chrome");
		driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        Actions action=new Actions(driver);
        action.doubleClick(driver.findElement(By.xpath("//div[text()=\"Top Offers\"]"))).build().perform();
        System.out.println("hi");
        Thread.sleep(1000);
        action.click(driver.findElement(By.xpath("//span[text()=\"Cart\"]"))).build().perform();
        System.out.println("bye");
		

	}

}
