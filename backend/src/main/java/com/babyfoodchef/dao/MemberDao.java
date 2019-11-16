package com.babyfoodchef.dao;

import com.babyfoodchef.dto.MemberDto;

public interface MemberDao {
    void insert(MemberDto memberDto);
    MemberDto findById(String id);
    MemberDto findByIdAndPw(MemberDto memberDto);
    MemberDto findByEmail(String email);
    MemberDto findByIdAndEmail(MemberDto memberDto);
    void update(MemberDto memberDto);
}
