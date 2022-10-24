package com.nttdata.bootcamp.productservice.Controller;

import ch.qos.logback.core.Context;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MiController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/port")
    public String viewPort(){

        return "mi puerto es " +serverPort;

    }


}
