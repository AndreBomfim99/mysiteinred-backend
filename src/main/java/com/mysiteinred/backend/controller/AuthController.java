package com.mysiteinred.backend.controller;

import com.mysiteinred.backend.util.JwtUtil;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASS = "1234";

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> credentials) {
        if (ADMIN_USER.equals(credentials.get("username")) && ADMIN_PASS.equals(credentials.get("password"))) {
            String token = JwtUtil.generateToken(ADMIN_USER);
            return Map.of("token", token);
        } else {
            throw new RuntimeException("Credenciais inválidas");
        }
    }
}
