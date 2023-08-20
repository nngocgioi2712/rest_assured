package com.gioinn.apis;

import com.gioinn.models.Product;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostProduct {
    public Response createAProduct(Product prod){
        return given().contentType(ContentType.JSON)
                .when()
                .body(prod)
                .post("/add");
    }
}
