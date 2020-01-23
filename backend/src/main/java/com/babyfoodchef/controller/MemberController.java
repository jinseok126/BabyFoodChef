package com.babyfoodchef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.dto.TokenDto;
import com.babyfoodchef.jwt.JwtService;
import com.babyfoodchef.service.MemberService;

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
    public String login(@RequestBody MemberDto memberDto) {
        MemberDto member = memberService.findByIdAndPw(memberDto);
        if (member == null) {
            return "";
        }
        TokenDto tokenDto = jwtService.createTokenDto(member);
        member.setToken(tokenDto.getRefreshToken());
        memberService.update(member);
        return tokenDto.getAccessToken();
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable String id) {
        MemberDto member = memberService.findById(id);
        return member.getNickName();
    }

    @GetMapping("/findByEmail/{email}")
    public String findByEmail(@PathVariable String email) {
        MemberDto member = memberService.findByEmail(email);
        if (member == null) {
            return "";
        }
        return member.getId();
    }

    @PostMapping("/findByIdAndEmail")
    public Boolean findByIdAndEmail(@RequestBody MemberDto memberDto) {
        MemberDto member = memberService.findByIdAndEmail(memberDto);
        if (member == null) {
            return false;
        }
        return true;
    }
}
