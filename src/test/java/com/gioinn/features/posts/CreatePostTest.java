package com.gioinn.features.posts;

import com.gioinn.apis.posts.CreatePost;
import com.gioinn.base.BaseTest;
import com.gioinn.models.Post;
import org.testng.annotations.Test;

public class CreatePostTest extends BaseTest {
    CreatePost createPost = new CreatePost();
    @Test
    public void createPostTest() {
        Post post = new Post();
//        post.setId("3");
        post.setTitle("hello gioi");
        createPost.createAPost(post)
                .then().assertThat().statusCode(201).log().all();
    }
}
