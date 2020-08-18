package com.api.petstore.tests;

import io.restassured.RestAssured;
import org.junit.Before;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static Properties prop = new Properties();


    @BeforeSuite
    public void beforeSuite(){
        try {
            prop.load(new FileInputStream("src/test/java/com/api/petstore/resources/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        RestAssured.baseURI  = prop.getProperty("uri");
    }

}
