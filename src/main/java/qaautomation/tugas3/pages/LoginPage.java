package qaautomation.tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	By loginPath= By.id("login");
	By loginBtn = By.xpath("//i[@class='material-icons-outlined f36']");
	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	public void login(String email) {
		setText(loginPath, email);
		clickAndWaitByXpath(loginBtn);
	}	
}