package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import net.minidev.json.JSONObject;

public class PostRequest {

	@Test
	public void test_03() {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
		 driver.navigate().to("http://www.google.com/");  
		 driver.manage().window().maximize(); 
		System.out.println("neha");
		driver.close();
	}
	//@Test
	public void test_01() {
		RestAssured.baseURI ="https://psgqaapiservice.azurewebsites.net/MVC/Manage/RegisterCandidateFromCareersPage";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("Email", "neha@thinkbridge.in");
		 requestParams.put("FirstName",  "John");
		 requestParams.put("LastName",  "mail");
		 requestParams.put("PhoneNumber1",  1333534534);
		 requestParams.put("PhoneNumber2",  "");
		 requestParams.put("PreferredJobTerm",  "contract");
		 requestParams.put("Country",  "US");
		 requestParams.put("State",  "CA");
		 requestParams.put("City",  "Adelanto");
		 requestParams.put("PostalCode",  12345);
		 requestParams.put("WorkAuthorization",  "yes");
		 requestParams.put("State",  "CA");
		 requestParams.put("City",  "Adelanto");
		 requestParams.put("PostalCode",  "12345");
		 requestParams.put("WorkAuthorization",  "yes");
		 requestParams.put("AlternateEmail",  "");
		 requestParams.put("YearOfExperience",  "2");
		 requestParams.put("MonthOfExperience",  "1");
		 requestParams.put("PreferredLocation1",  "");
		 requestParams.put("PreferredLocation2",  "");
		 requestParams.put("Skills",  "java");
		 requestParams.put("JobOrderId", 38063);
		 requestParams.put("SubAccountId", "460");
		 requestParams.put("AccountId", 238);
		 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString()).post().then().log().all().assertThat().statusCode(201);
	}
	
	//@Test
	public void test_02() {
		RestAssured.baseURI ="https://psgqaapiservice.azurewebsites.net/GlobalDbAdvancedSearch";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("SearchText",  "java");
		 requestParams.put("PageNo",  1);
		 requestParams.put("NoOfRecordsPerPage",  "100");
		 requestParams.put("OrderBy",  "UpdatedOn");
		 requestParams.put("SortOrder",  "DESC");
		 requestParams.put("IsResumeSearch", "true");
		 requestParams.put("Filters",  "");
		 requestParams.put("RadiusSearchLocation",  "Irvine, CA 92602");
		 requestParams.put("Radius",  16.09344);
		 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString()).post().then().log().all().assertThat().statusCode(201);
	}
}
