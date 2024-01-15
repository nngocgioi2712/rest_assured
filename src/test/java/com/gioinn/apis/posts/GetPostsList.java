package com.gioinn.apis.posts;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetPostsList {

    public Response getPostsList() {
        return given().
                get("/posts");
    }
}
