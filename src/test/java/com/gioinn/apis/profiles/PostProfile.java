package com.gioinn.apis.profiles;

import com.gioinn.models.Profile;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostProfile {
    public Response createAProfile(Profile prf) {
        return given().contentType(ContentType.JSON).
                when().body(prf).
                post();
    }
}
