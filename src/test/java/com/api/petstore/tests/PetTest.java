package com.api.petstore.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PetTest extends BaseTest {

	@Test
	public void findPetById() {
		given()
				.pathParams("id","1")
				.when()
					.get("/pet/{id}")
				.then()
					.statusCode(200)
				.and()
					.body("name", is("doggie"));


	}

}
