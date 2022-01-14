package qaautomation.tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{
	String pricePath ="(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'][contains(text(),'₹ 13,463')])[1]";

	public ProfilePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public String viewPrice() {
		return driver.get().findElement(By.xpath(pricePath)).getText();
	}
}