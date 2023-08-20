package com.gioinn.apis;

import com.gioinn.models.Product;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PutProduct {
    public Response updateAProduct(Product prod, int id){
        return given()
                .contentType(ContentType.JSON)
                .when()
                .body(prod)
                .put("/{id}", id);

    }
}
