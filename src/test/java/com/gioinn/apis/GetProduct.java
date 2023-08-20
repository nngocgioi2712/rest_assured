package com.gioinn.apis;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetProduct {
    public Response getAllProducts(){
        return given().when().get();
    }
    public Response getProductById(int id){
        return  given().when().get("/{id}", id);
    }
}
