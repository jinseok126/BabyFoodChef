package com.babyfoodchef.controller;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.mapper.MemberMapper;
import com.babyfoodchef.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping("/signUp")
    public void insert(@RequestBody MemberDto member, ModelMap map) {
        memberService.insert(member);
    }
}
