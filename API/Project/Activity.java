package project;


import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;import io.restassured.builder.ResponseSpecBuilder;import io.restassured.http.ContentType;import io.restassured.response.Response;import io.restassured.specification.RequestSpecification;import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;import org.testng.Reporter;
public class Activity {	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int id;
	@BeforeClass	public void gitHubSetUp() {
		requestSpec = new RequestSpecBuilder()				.setContentType(ContentType.JSON)				.addHeader("Authorization", "token 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")				.setBaseUri("https://api.github.com")				.build();
		responseSpec = new ResponseSpecBuilder()				.expectContentType("application/json")				.build();
	}	@Test(priority=2)	public void POSTRequest() {
		String request_body = "{\"title\": \"TestAPIKey\",\n"				+ "    \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCmthrn1QoAyxArx0w+AYHuh21sffz144W3yCvFuj7cRDLktXUXbUpVdCd5qr4RwkvHE6VA3IGXMXUiyDKteSjmoGm34YcVHbA2nBIm4q7EksUb6SnBJmfLcS2GntXwj6rpJ2CW6Zy9y2OT8lU4K1as6xFKLL+9DZPVUCh+gJyWGEVnQB/wOKNA3qCnYXGRaJPW6LxxNs1g5AStFjaognrEMstHp6VSMI5NZlIdF1YKX7YsoMRtGjEkRCk6ZLxpHZanME0GZpCOl4sgt30w3LgEoI2u13Vy1EGLsFy7fhGvQFIqzjMzH02yv5s5/lWcnFLZJSbpjPSxTflaFsHNTmbOAWqG8VkLg/SMG+HifczbS7rNsrZVaVHJoSKv0G3t6CXQrfCz9pn8BpJo2Xj6fYGxX0qRx/lW6uD4xQ2YQ8wN84c3p8me5j3bMpAxYW5UGl893iW64Gz8leqZuOYBehXEIYaQZRrlHrDeq77u6omd09/F0ljSdfv0S9RdU31DBTs=\"}";
		Response response = given().spec(requestSpec)				.body(request_body)				.when().post("/user/keys");		response.then().spec(responseSpec);
		// Print response		String resp_body = response.getBody().asPrettyString();		System.out.println(resp_body);		id = response.then().extract().path("id");		System.out.print("ID:" +id);
		// Assertion		Assert.assertEquals(response.getStatusCode(),201);
	}	@Test(priority=1)	public void GETRequest() {		Response response = given().spec(requestSpec)				.get("/user/keys");
		//print		System.out.println(response.getBody().asPrettyString());		//report		Reporter.log(response.getBody().asPrettyString());		//Assertion		Assert.assertEquals(response.getStatusCode(),200);
	}
	@Test(priority=3)
	public void DELETERequest() {		Response response = given().spec(requestSpec).pathParam("keyId",id).delete("/user/keys/{keyId}");		//Report		Reporter.log(response.getBody().asPrettyString());		//Assert		Assert.assertEquals(response.getStatusCode(),204);	}
}
}
