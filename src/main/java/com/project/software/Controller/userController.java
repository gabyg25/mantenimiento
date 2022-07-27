package com.project.software.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class userController {

    @GetMapping("name")
    public String user(){
        return "Hello iam dulce";
    }

    @GetMapping("lastName")
    public String last(){
        return "My lastName is Mendoza";
    }
}
