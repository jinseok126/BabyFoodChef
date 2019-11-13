package com.babyfoodchef.jwt;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;

public interface JwtService  {
    TokenDto createTokenDto(MemberDto memberDto);
}
