package localApi.api.endpoints;

import java.util.ResourceBundle;

public class Routes {
    public static String baseUrl = ResourceBundle.getBundle("roots")
                                                    .getString("BASE_URL");

    //post module
    public static String createPostUrl = baseUrl + "/posts";
    public static String getPostListUrl = baseUrl + "/posts";
    public static String getPostByIdUrl = baseUrl + "/posts/{id}";
    public static String updatePostUrl = baseUrl + "/posts/{id}";
    public static String deletePostUrl = baseUrl + "/posts/{id}";

}
