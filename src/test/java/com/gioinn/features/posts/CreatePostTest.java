package com.gioinn.features.posts;

import com.gioinn.apis.posts.CreatePost;
import com.gioinn.base.BaseTest;
import com.gioinn.models.Post;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Random;

public class CreatePostTest extends BaseTest {
    CreatePost createPost = new CreatePost();
    @Test
    public void createPostTest() {
        Post post = new Post();
        Random rand = new Random();
        int id = rand.nextInt(100,10000);
        post.setId(Integer.toString(id));
        post.setTitle("hello " + id);
        post.setDesc("xin chao xin chao");
        post.setUser("1");

        Response res = createPost.createAPost(post);

        res.then()
                .assertThat()
                    .statusCode(201)
                .log().all();
    }
}
