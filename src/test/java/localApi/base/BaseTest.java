package localApi.base;

import io.restassured.RestAssured;
import localApi.api.endpoints.Routes;
import org.testng.annotations.BeforeClass;

import java.util.ResourceBundle;

public class BaseTest {
    private ResourceBundle getUrl() {
        ResourceBundle routes = ResourceBundle.getBundle("roots");
        return routes;
    }
    @BeforeClass
    public void init(){
        RestAssured.baseURI = getUrl().getString("BASE_URL");
//        RestAssured.basePath = "/products";
    }
}
