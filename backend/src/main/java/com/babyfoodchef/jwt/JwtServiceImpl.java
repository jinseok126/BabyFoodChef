package com.babyfoodchef.jwt;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;
import com.babyfoodchef.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class JwtServiceImpl implements JwtService {
    @Autowired
    MemberService memberService;
    @Autowired
    JwtProvider jwtProvider;

    @Override
    public TokenDto createTokenDto (MemberDto memberDto) {
        TokenDto tokenDto = jwtProvider.createToken(memberDto);
        return tokenDto;
    }

    public String checkToken(HttpServletResponse response, HttpServletRequest request, String beforeToken) {

        String token = null;

        if(beforeToken != null) {
            String checkValid = jwtProvider.validateToken(beforeToken);

            // access token expired
            if(checkValid == "expiredTokenDate") {
                String id = request.getHeader("MemberId");
                MemberDto member = memberService.findById(id);

                // refresh token expired
                String boolRefreshToken = jwtProvider.validateToken(member.getToken());
                System.out.println("boolRefreshToken: "+boolRefreshToken);
                if(boolRefreshToken == "expiredTokenDate") {
                    response.setHeader("TokenValid", "expired");

//                    // 만료된 토큰일 경우 refresh 토큰도 없애기
//                    member.setToken(null);
//                    memberService.update(member);

//              access token expired and refresh token active
                } else if(boolRefreshToken == "success") {
                    // 재갱신
                    TokenDto tokenDto = jwtProvider.createToken(member);
                    member.setToken(tokenDto.getRefreshToken());
                    memberService.update(member);
                    response.setHeader("TokenValid", "refresh");
                    response.setHeader("Authorization", tokenDto.getAccessToken());

                    token = tokenDto.getAccessToken();
                }
                // 사용가능한 access token일 경우
            } else if(checkValid == "success") {
                token = beforeToken;
            }
        } // if
        return token;
    } // checkToken
}
