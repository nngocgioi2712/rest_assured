package com.gioinn.features.posts;

import com.gioinn.apis.posts.UpdatePostByPatch;
import com.gioinn.apis.posts.UpdatePostByPut;
import com.gioinn.base.BaseTest;
import com.gioinn.models.Post;
import org.testng.annotations.Test;

public class UpdatePostTest extends BaseTest {
    UpdatePostByPatch updatePostByPatch = new UpdatePostByPatch();
    UpdatePostByPut updatePostByPut = new UpdatePostByPut();

    @Test
    public void updatePostByPatchMethodTest() {
        Post post = new Post();
        post.setId("change title 1");
        updatePostByPatch.updatePostByPatchMethod(post, "3");
    }

    @Test
    public void updatePostByPutMethodTest() {
        Post post = new Post();
        post.setTitle("change title");
        updatePostByPut.updatePostByPutMethod(post, "3");
    }
}
