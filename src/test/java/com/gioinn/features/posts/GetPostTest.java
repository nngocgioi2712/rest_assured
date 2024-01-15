package com.gioinn.features.posts;

import com.gioinn.apis.posts.GetPostByID;
import com.gioinn.apis.posts.GetPostsList;
import com.gioinn.base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class GetPostTest extends BaseTest {
    GetPostsList getPostsList = new GetPostsList();
    GetPostByID getPostByID = new GetPostByID();
    @Test
    public void getPostsListTest() {
        Response res = getPostsList.getPostsList();
        res.then().
                assertThat().
                    body(matchesJsonSchemaInClasspath("schema/post-schema.json")).
                    statusCode(200);

    }

    @Test
    public void getPostByIdTest(String id) {
        Response res = getPostByID.getPostByID(id);
        res.then().
                assertThat().
                statusCode(200);
    }
}
