package localApi.api.test;

import io.restassured.response.Response;
import localApi.api.endpoints.PostEndpoints;
import localApi.base.BaseTest;
import localApi.models.request.Post;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Random;

public class PostTests {
    PostEndpoints postEndpoints = new PostEndpoints();
    @Test (priority = 0)
    public void createPostTest(ITestContext context) {
        Post post = new Post();
        Random rand = new Random();
        int id = rand.nextInt(100,10000);
        post.setId(Integer.toString(id));
        post.setTitle("hello " + id);
        post.setDesc("xin chao xin chao");
        post.setUser("1");

        Response res = postEndpoints.createPost(post);

        context.setAttribute("id", res.jsonPath().getString("id"));
        res.then()
                .assertThat()
                .statusCode(201)
                .log().all();
    }

    @Test (priority = 1)
    public void getPostListTest() {
        Response res = postEndpoints.getPostList();
        res.then()
                .assertThat()
//                .body(matchesJsonSchemaInClasspath("schema/post-schema.json"))
                .statusCode(200);
    }

    @Test (priority = 2)
    public void getPostByIdTest(ITestContext context) {
        Response res = postEndpoints.getPostByID((String) context.getAttribute("id"));
        res.then()
                .assertThat()
                .statusCode(200);
    }

    @Test (priority = 3)
    public void updatePostByPatchMethodTest(ITestContext context) {
        HashMap post = new HashMap();
        post.put("title", "only change title");

        Response res = postEndpoints.updatePostByPatchMethod(post, (String) context.getAttribute("id"));
        res.then()
                .assertThat()
                .statusCode(200);

    }

    @Test (priority = 4)
    public void updatePostByPutMethodTest(ITestContext context) {
        HashMap post = new HashMap();
        post.put("title", "only change title");

        Response res = postEndpoints.updatePostByPutMethod(post, (String) context.getAttribute("id"));
        res.then()
                .assertThat()
                .statusCode(200);
    }

    @Test (priority = 5)
    public void deletePostTest(ITestContext context) {
        Response res = postEndpoints.deletePost((String) context.getAttribute("id"));
        res.then()
                .assertThat()
                .statusCode(200);
    }
}
