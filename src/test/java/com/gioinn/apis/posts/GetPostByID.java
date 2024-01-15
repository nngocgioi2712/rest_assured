package com.gioinn.apis.posts;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetPostByID {
    public Response getPostByID(String id) {
        return given().contentType(ContentType.JSON).
                when().get("/posts/" + id);
    }
}
