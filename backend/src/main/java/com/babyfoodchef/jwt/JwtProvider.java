package com.babyfoodchef.jwt;

import java.util.Base64;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class JwtProvider {

    @Value("spring.jwt.secret")
    private String secretKey;
    private long accessTokenValidMilisecond = 1000L * 1 * 1; // 1시간만 토큰 유효
    private long refreshTokenValidMilisecond = 1000L * 60 * 60; // 1시간만 토큰 유효

    @PostConstruct
    protected void init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
    }

}
