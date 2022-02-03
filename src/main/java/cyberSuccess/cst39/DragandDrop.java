package cyberSuccess.cst39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseClass
{

	public static void main(String[] args) 
	{
		 DragandDrop dd =new DragandDrop();
		 WebDriver driver=dd.getBrowserInstance("Chrome");
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
         String s=driver.getTitle();
         System.out.println(s);
         driver.findElement(By.id("Photo Manager")).click();
         Actions action=new Actions(driver);
         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
         //WebElement source=driver.
         System.out.println("hi");
         WebElement source=driver.findElement(By.xpath("//img[@src=\"images/high_tatras_min.jpg\"]"));
         WebElement destination=driver.findElement(By.id("trash"));
         action.clickAndHold(source).release(destination).build().perform();
         WebElement source1=driver.findElement(By.xpath("src=\"images/high_tatras2_min.jpg\""));
         WebElement destination2=driver.findElement(By.id("trash"));
         action.doubleClick(source1).release(destination2).build().perform();
	}

}
