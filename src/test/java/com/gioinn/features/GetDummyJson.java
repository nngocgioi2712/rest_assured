package com.gioinn.features;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.gioinn.models.Product;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetDummyJson {

    @BeforeMethod
    public void init(){
        RestAssured.baseURI ="https://dummyjson.com";
        RestAssured.basePath = "/products";

    }
    @Test
    public void getAllProducts(){
        Response res = given().when().get("/1");
        res.prettyPrint();
        res.then().statusCode(200);
    }
    @Test
    public void addAProduct(){
        Product prod = new Product();
        prod.setTitle("pencil");
        Response res = given().contentType(ContentType.JSON)
                .when()
                .body(prod)
                .post("/add");
        res.prettyPrint();
        res.then().statusCode(200);
    }
    @Test
    public void updateProduct(){
        Product prod = new Product();
        prod.setTitle("pencil1");
        prod.setDescription("hihi");
        Response res = given().contentType(ContentType.JSON)
                .when()
                .body(prod)
                .put("/1");
        res.prettyPrint();
        res.then().statusCode(200);
    }
    @Test
    public  void deleteProduct(){
        Response res = given().when().delete("/1");
        res.prettyPrint();
    }
}