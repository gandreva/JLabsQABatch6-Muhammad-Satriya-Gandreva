package qaautomation.tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {

	By fromBtn = By.xpath("//label[@for='fromCity']");
	By fromSearch = By.xpath("//input[@placeholder='From']");
	By fromInput = By.xpath("//p[normalize-space()='Jakarta, Indonesia']");
	
	By toSearch = By.xpath("//input[@placeholder='To']");
	By toInput = By.xpath("(//p[normalize-space()='Banda Aceh, Indonesia'])");
	
	By departure= By.xpath("//span[contains(@aria-label,'Next Month')]");
	By date = By.xpath("//div[@aria-label='Fri Feb 11 2022']");
		
	By searchBtn = By.xpath("//a[normalize-space()='Search']");
	
	public SearchPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void  searchTrip(String from, String to) {
		clickAndWaitByXpath(fromBtn);
		setText(fromSearch, from);
		clickAndWaitByXpath(fromInput);
		
		setText(toSearch, to);
		clickAndWaitByXpath(toInput);
		
		clickAndWaitByXpath(departure);
		clickAndWaitByXpath(date);
		
		clickAndWaitByXpath(searchBtn);
	}
}