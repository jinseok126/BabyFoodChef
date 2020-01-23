package com.babyfoodchef.jwt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;

public interface JwtService  {
    TokenDto createTokenDto(MemberDto memberDto);
    String checkToken(HttpServletResponse response, HttpServletRequest request, String beforeToken);
}
