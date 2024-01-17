package com.gioinn.features.posts;

import com.gioinn.apis.posts.UpdatePostByPatch;
import com.gioinn.apis.posts.UpdatePostByPut;
import com.gioinn.base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

public class UpdatePostTest extends BaseTest {
    UpdatePostByPatch updatePostByPatch = new UpdatePostByPatch();
    UpdatePostByPut updatePostByPut = new UpdatePostByPut();

    @Test
    public void updatePostByPatchMethodTest() {
        HashMap post = new HashMap();
        post.put("title", "only change title");

        Response res = updatePostByPatch.updatePostByPatchMethod(post, "1010");
        res.then()
                .assertThat()
                    .statusCode(200);

    }

    @Test
    public void updatePostByPutMethodTest() {
        HashMap post = new HashMap();
        post.put("title", "only change title");

        Response res = updatePostByPut.updatePostByPutMethod(post, "5396");
        res.then()
                .assertThat()
                    .statusCode(200);
    }
}
