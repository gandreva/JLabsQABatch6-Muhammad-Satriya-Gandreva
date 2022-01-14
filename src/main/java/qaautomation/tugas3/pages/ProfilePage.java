package qaautomation.tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{
	String profileTextPath = "//span[@class='ellipsis b']";

	public ProfilePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	public String getFirstMailText(){
		driver.get().switchTo().frame("ifmail");
		
	return driver.get().findElement(By.xpath(profileTextPath)).getText();
	}
}