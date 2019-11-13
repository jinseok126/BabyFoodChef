package com.babyfoodchef.jwt;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;
import com.babyfoodchef.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
