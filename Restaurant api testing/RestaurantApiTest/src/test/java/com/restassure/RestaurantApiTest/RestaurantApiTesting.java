package com.restassure.RestaurantApiTest;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import payload.DataForTests;
import tokens.Tokenss;
import uriData.UriLinkss;

public class RestaurantApiTesting {
	
	String jwtToken = Tokenss.generateJwtToken("475938");
	
	public static Logger logger = LogManager.getLogger(RestaurantApiTesting.class);
	

	@Test(priority=1)
	public void RestaurantApiGetTestt() {
		
		String log4j1Path = "F:\\svl svs\\My projects\\Phase -3 projects\\Restaurant api testing\\RestaurantApiTest\\resources\\log4j1.xml";
		Configurator.initialize(null, log4j1Path);
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(UriLinkss.baseURI).setBasePath("/restaurants").build();
		RequestSpecification req1 = given().spec(req);
		
		ResponseSpecification res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		Response res1 = req1.when().get().then().log().all().spec(res).extract().response();
		
		String res2 = res1.asPrettyString();
		
		System.out.println(res2);
		System.out.println(jwtToken);
			
		logger.info("");
		logger.info("get data: "+res2);
		logger.info("");
		logger.info("jwtToken");
		
	}
	
	@Test(priority=2)
	public void RestaurantApiPostTestt() {
			
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(UriLinkss.baseURI).setBasePath("/restaurants").build();
		RequestSpecification req1 = given().spec(req).body(DataForTests.postData()).header("Authorization", "Bearer " + jwtToken);
		
		ResponseSpecification res = new ResponseSpecBuilder().build();
		Response res1 = req1.when().post().then().log().all().spec(res).extract().response();
		
		String res2 = res1.asPrettyString();
		
		System.out.println(res2);
		
		logger.info("post data: "+res2);
		logger.info("");
		
	}
		
	@Test(priority=3)
	public void RestaurantApiPutTestt() {
				
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(UriLinkss.baseURI).setBasePath("/restaurants/5").build();
		RequestSpecification req1 = given().spec(req).body(DataForTests.putData()).header("Authorization", "Bearer " + jwtToken);
		
		ResponseSpecification res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		Response res1 = req1.when().put().then().log().all().spec(res).extract().response();
		
		String res2 = res1.asPrettyString();
		
		System.out.println(res2);
		
		logger.info("put data: "+res2);
		logger.info("");
		
		
		
	}
		
	
	@Test(priority=4)
	public void RestaurantApiGetTestt1() {
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(UriLinkss.baseURI).setBasePath("/restaurants").build();
		RequestSpecification req1 = given().spec(req);
		
		ResponseSpecification res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		Response res1 = req1.when().get().then().log().all().spec(res).extract().response();
		
		String res2 = res1.asPrettyString();
		
		System.out.println(res2);
		System.out.println(jwtToken);
		
		logger.info("get data: "+res2);
		logger.info("");
		
			
	}
		
	@Test(priority=5)
	public void RestaurantApiDeleteTestt() {
			
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(UriLinkss.baseURI).setBasePath("/restaurants/6").build();
		
		System.out.println("req isssssssssssss:   "+req);
		
		RequestSpecification req1 = given().spec(req).header("Authorization", "Bearer " + jwtToken);
		
		ResponseSpecification res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		Response res1 = req1.when().delete().then().log().all().spec(res).extract().response();
		
		String res2 = res1.asPrettyString();
		
		System.out.println(res2);
		System.out.println(jwtToken);
		
		logger.info("Delete data: "+res2);
		logger.info("");
		
		
		
	}
	
	@Test(priority=6)
	public void RestaurantApiGetTestt2() {
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(UriLinkss.baseURI).setBasePath("/restaurants").build();
		RequestSpecification req1 = given().spec(req);
		
		ResponseSpecification res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		Response res1 = req1.when().get().then().log().all().spec(res).extract().response();
		
		String res2 = res1.asPrettyString();
		
		System.out.println(res2);
		System.out.println(jwtToken);
		
		logger.info("get data: "+res2);
		logger.info("");
		
			
	}
}
