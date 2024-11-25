package com.example.testrouteservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun getTest(): String {
        println("TestController.getTest() called")
        return "Hello, World! ~Test"
    }
}