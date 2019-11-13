package com.babyfoodchef.service;

import com.babyfoodchef.dto.LoginObjDto;
import com.babyfoodchef.dto.MemberDto;
import org.springframework.stereotype.Service;

public interface MemberService {
    void insert(MemberDto memberDto);
    MemberDto findById(String id);
    MemberDto findByIdAndPw(LoginObjDto loginObj);
    void update(MemberDto memberDto);
}