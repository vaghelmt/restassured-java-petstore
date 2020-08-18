package com.api.petstore.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class StoreTest extends BaseTest{

    @Test
    public void trackOrderStatus() {
                given()
                    .pathParams("id","1")
                .when()
                    .get("store/order/{id}")
                .then()
                    .statusCode(200)
                .and()
                    .body("status",is("placed"));

    }
}
