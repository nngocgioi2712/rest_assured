package com.gioinn.apis.posts;

import com.gioinn.models.Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreatePost {

    public Response createAPost(Post post) {
        return given().contentType(ContentType.JSON).
                when().body(post).
                post("/posts");
    }

}
