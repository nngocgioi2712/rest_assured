package com.gioinn.features;

import com.gioinn.apis.GetProduct;
import com.gioinn.base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetProductTest extends BaseTest {
    GetProduct getProduct = new GetProduct();
    @Test
    public void getAllProducts(){
        Response res = getProduct.getAllProducts();
        res.prettyPrint();
        res.then().statusCode(200);
    }
    @Test
    public void getFirstProducts(){
        Response res = getProduct.getProductById(1);
        res.then().statusCode(200);
    }
}
