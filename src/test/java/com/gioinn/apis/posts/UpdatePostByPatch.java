package com.gioinn.apis.posts;

import com.gioinn.models.Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UpdatePostByPatch {
    public Response updatePostByPatchMethod(Post post, String id) {
        return given().contentType(ContentType.JSON).
                when().body(post).
                patch("posts/" + id);
    }
}
