package com.babyfoodchef.jwt;

import java.util.Base64;
import java.util.Date;

import javax.annotation.PostConstruct;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;
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

    public TokenDto createToken(MemberDto memberDto) {
        Claims claims = Jwts.claims().setSubject(memberDto.getId());
        claims.put("nickName", memberDto.getNickName());

        Date now = new Date();
        String accessToken = Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setClaims(claims) // 데이터
                .setIssuedAt(now) //발행 일자
                .setExpiration(new Date(now.getTime()+accessTokenValidMilisecond)) //유효 시간
                .signWith(SignatureAlgorithm.HS256, secretKey) //사인키
                .compact();

        String refreshToken = Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setClaims(claims) // 데이터
                .setIssuedAt(now) //발행 일자
                .setExpiration(new Date(now.getTime()+refreshTokenValidMilisecond)) //유효 시간
                .signWith(SignatureAlgorithm.HS256, secretKey) //사인키
                .compact();

        TokenDto tokenDto = new TokenDto();
        tokenDto.setAccessToken(accessToken);
        tokenDto.setRefreshToken(refreshToken);

        return tokenDto;
    }

}
