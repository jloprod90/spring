package com.nttdata.bootcamp.retoconfigservice.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.module.Configuration;
@RefreshScope
@RestController
public class ProductController {

    @Value("${product.product-name}")
    private String myProduct;

    @GetMapping(path = "/getProductName")
    public String myProduct(){
        return this.myProduct;
    }
}
