package com.mysiteinred.backend.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.security.Key;

public class JwtUtil {

    private static final String SECRET_KEY = "minha-chave-secreta-supersegura-minha-chave-secreta"; // mínimo 256 bits
    private static final long EXPIRATION_TIME = 86400000; // 1 dia

    private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}


