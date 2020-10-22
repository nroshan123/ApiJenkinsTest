package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class TestApi {

	@Test
	public void test_011() {
		Response resp = when().
		                get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=90f695a28a53fade4f68038d47ad6d91");
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), "200");
		System.out.println("PASSED");
		
	}
}
