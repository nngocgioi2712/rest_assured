package com.gioinn.apis.posts;

import com.gioinn.models.Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeletePost {
    public Response deletePost(String id) {
        return given().
                delete("/posts/" + id);
    }
}
