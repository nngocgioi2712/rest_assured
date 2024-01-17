package com.gioinn.base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void init(){
        RestAssured.baseURI ="http://localhost:3000/";
//        RestAssured.basePath = "/products";
    }
}
