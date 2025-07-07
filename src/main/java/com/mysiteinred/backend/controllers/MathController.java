package com.mysiteinred.backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/math")
public class MathController {

    @GetMapping("/square")
    public double square(@RequestParam double x) {
        return x * x;
    }
}