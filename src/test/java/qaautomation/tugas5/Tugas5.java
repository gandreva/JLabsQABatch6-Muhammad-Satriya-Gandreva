package qaautomation.tugas5;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Tugas5 {
	
	@Test(priority = 1)
	public void signUpAPI() {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String email = firstName+"_"+lastName+"@hotmail.com";
		String pass = "Gs#"+ faker.number().digits(5);
		String phoneNumber ="+62-8"+ faker.number().digits(10);

		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		String signUpPayload = "{\"user\":{\"first_name\":\""+firstName+"\",\"last_name\":\""+lastName+"\",\"email\":\""+email+"\",\"password\":\""+pass+"\",\"phone_number\":\""+phoneNumber+"\",\"user_type\":\"User\",\"currency_id\":3}}";
		System.out.println(signUpPayload);
		Response response = (Response) RestAssured.given().contentType("application/json").body(signUpPayload).when()
				.post("/users");
		assertEquals(response.getStatusCode(), 200);	

	}
}