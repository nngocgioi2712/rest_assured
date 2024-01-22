package localApi.api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import localApi.models.request.Post;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostEndpoints {
    public Response createPost(Post post) {
        return given().contentType(ContentType.JSON).
                when().body(post).
                post(Routes.createPostUrl);
    }

    public Response getPostList() {
        return given().contentType(ContentType.JSON).
                when().get(Routes.getPostListUrl);
    }

    public Response getPostByID(String id) {
        return given().contentType(ContentType.JSON).
                pathParams("id", id).
                when().get(Routes.getPostByIdUrl);
    }

    public Response updatePostByPatchMethod(HashMap post, String id) {
        return given().contentType(ContentType.JSON).
                pathParams("id", id).
                when().body(post).
                patch(Routes.updatePostUrl);
    }

    public Response updatePostByPutMethod(HashMap post, String id) {
        return given().contentType(ContentType.JSON).
                pathParams("id", id).
                when().body(post).
                put(Routes.updatePostUrl);
    }

    public Response deletePost(String id) {
        return given().
                pathParams("id", id).
                delete(Routes.deletePostUrl);
    }
}
