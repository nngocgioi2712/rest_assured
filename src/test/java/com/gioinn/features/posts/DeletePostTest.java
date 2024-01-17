package com.gioinn.features.posts;

import com.gioinn.apis.posts.DeletePost;
import com.gioinn.apis.posts.UpdatePostByPut;
import com.gioinn.base.BaseTest;
import com.gioinn.models.Post;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeletePostTest extends BaseTest {
    DeletePost deletePost = new DeletePost();

    @Test
    public void deletePostTest() {
        Response res = deletePost.deletePost("4");
        res.then()
                .assertThat()
                    .statusCode(200);
    }
}
