package com.babyfoodchef.jwt;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface JwtService  {
    TokenDto createTokenDto(MemberDto memberDto);
    String checkToken(HttpServletResponse response, HttpServletRequest request, String beforeToken);
}
