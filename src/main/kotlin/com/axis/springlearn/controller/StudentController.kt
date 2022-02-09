package com.axis.springlearn.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {
    @GetMapping("/hw")
    fun hw() : String {
        return "hellow world"
    }

    @GetMapping("/student")
    fun student() : String {
        return "hellow student"
    }
}