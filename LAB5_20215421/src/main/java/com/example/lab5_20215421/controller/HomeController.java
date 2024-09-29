package com.example.lab5_20215421.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
public class HomeController {
    @GetMapping("")
    public String index(){
        return "index";
    }
}
