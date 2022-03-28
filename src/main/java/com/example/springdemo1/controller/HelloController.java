package com.example.springdemo1.controller;

public class HelloController {
    public String hello(String name) {
        return  String.format("Hello, %s", name);
    }
}
