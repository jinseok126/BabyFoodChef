package com.babyfoodchef.controller;

import com.babyfoodchef.dto.LoginObjDto;
import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;
import com.babyfoodchef.jwt.JwtService;
import com.babyfoodchef.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/member")

public class MemberController {
    @Autowired
    MemberService memberService;

    @Autowired
    JwtService jwtService;

    @PostMapping("/register")
    public void insert(@RequestBody MemberDto memberdto) {
        memberService.insert(memberdto);
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginObjDto loginObj, HttpServletResponse response) {
        MemberDto member = memberService.findByIdAndPw(loginObj);
        if (member==null) return;
        TokenDto tokenDto = jwtService.createTokenDto(member);
        response.addHeader("Token", tokenDto.getAccessToken());
        member.setToken(tokenDto.getRefreshToken());
        memberService.update(member);
    }
    @GetMapping("/findById/{id}")
    public void sendMemberInfo(@PathVariable String id, HttpServletResponse response){
        //헤더에 닉네임을 보냄
        //나중에 보낼게 더 있으면 토큰에다가 추가해서 보내기.
        MemberDto member = memberService.findById(id);
        response.addHeader("NickName", member.getNickName());
    }
}
