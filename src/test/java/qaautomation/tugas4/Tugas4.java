package qaautomation.tugas4;

import org.testng.annotations.Test;
import qaautomation.tugas4.pages.LoginPage;
import qaautomation.tugas4.pages.SearchPage;
import qaautomation.tugas4.pages.ProfilePage;

public class Tugas4 extends BaseWebTest{
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	SearchPage searchPage = new SearchPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	@Test (testName = "verify printout is successful", description = "login will be working just fine")
	public void test() {
		String username = "gandreva@hotmail.com";
		String password = "Gs242494#";
		String from = "Jakarta";
		String to = "Banda Aceh";
		
		loginPage.login(username, password);
		searchPage.searchTrip(from, to);
		profilePage.viewPrice();
		String actualString = profilePage.viewPrice();
		System.out.println("Ticket Price Value : "+ actualString.replaceAll("[^0-9]", ""));
	}
}