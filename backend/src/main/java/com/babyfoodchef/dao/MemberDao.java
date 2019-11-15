package com.babyfoodchef.dao;

import com.babyfoodchef.dto.LoginObjDto;
import com.babyfoodchef.dto.MemberDto;

public interface MemberDao {
    void insert(MemberDto memberDto);
    MemberDto findById(String id);
    MemberDto findByIdAndPw(MemberDto memberDto);
    MemberDto findByEmail(String email);
    MemberDto findByIdAndEmail(String id, String email);
    void update(MemberDto memberDto);
}
