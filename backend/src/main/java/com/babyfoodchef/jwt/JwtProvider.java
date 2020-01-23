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

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;

@RequiredArgsConstructor
@Component
public class JwtProvider {

    @Value("spring.jwt.secret")
    private String secretKey;
    // 1000L * 60 * 60 => 1시간
    private long accessTokenValidMillisecond = 1000L * 60 * 60;
    private long refreshTokenValidMillisecond = 1000L * 60 * 60;

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
                .setExpiration(new Date(now.getTime()+accessTokenValidMillisecond)) //유효 시간
                .signWith(SignatureAlgorithm.HS256, secretKey) //사인키
                .compact();

        String refreshToken = Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setClaims(claims) // 데이터
                .setIssuedAt(now) //발행 일자
                .setExpiration(new Date(now.getTime()+refreshTokenValidMillisecond)) //유효 시간
                .signWith(SignatureAlgorithm.HS256, secretKey) //사인키
                .compact();

        return new TokenDto(accessToken, refreshToken);
    }

    public String validateToken(String token) {
        String resultMessage = "";

        if(token == null) {
            resultMessage = "not token";
        } else {
            try {
                Jws<Claims> claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
                if(!claims.getBody().getExpiration().before(new Date())) {
                    resultMessage = "success";
                }
            } catch (ExpiredJwtException e) {
                resultMessage = "expiredTokenDate";	    // 토큰 만료
            } catch (SignatureException e) {
                resultMessage = "wrongSign";			// 토큰의 서명 검증이 위조되거나 문제가 생긴 경우
            } catch (Exception e) {
                resultMessage = "error";
            }
        }
        return resultMessage;
    }

}
