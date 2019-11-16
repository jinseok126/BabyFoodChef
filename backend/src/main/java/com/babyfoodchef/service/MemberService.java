package com.babyfoodchef.service;

import com.babyfoodchef.dto.MemberDto;

public interface MemberService {
    void insert(MemberDto memberDto);
    MemberDto findById(String id);
    MemberDto findByIdAndPw(MemberDto memberDto);
    MemberDto findByEmail(String email);
    MemberDto findByIdAndEmail(MemberDto memberDto);
    void update(MemberDto memberDto);
}