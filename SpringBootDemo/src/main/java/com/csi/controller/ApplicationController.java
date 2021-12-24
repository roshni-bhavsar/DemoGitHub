package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "WELCOME TO CSI PUNE";
    }

    @GetMapping("/service")
    public String address()
    {
        return "ELPRO MALL | PUNE | MH";
    }

    @GetMapping("/address")
    public String services()

    {
        return "ELPRO MALL | PUNE ";
    }
   @GetMapping("/hii")
    public String hii()

    {
        return "PUNE";
    }

    @GetMapping("/hooo")
    public String hoooo()
    {
        return "MH";
    }
    @GetMapping("/minal")
    public String minal()
    {
        return "nashik";
    }
}
