package com.gioinn.features;

import com.gioinn.apis.PostProduct;
import com.gioinn.base.BaseTest;
import com.gioinn.models.Product;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateProductTest extends BaseTest {
    PostProduct postProduct = new PostProduct();

    @Test
    public void createProduct(){
        Product prod = new Product();
        prod.setTitle("pencil");
        Response res = postProduct.createAProduct(prod);
        res.prettyPrint();
        res.then().statusCode(200);
    }
}
