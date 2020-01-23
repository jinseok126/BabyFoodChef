package com.babyfoodchef.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.babyfoodchef.dto.MemberDto;

@Mapper
public interface MemberMapper {
    void insert(MemberDto memberDto);
    MemberDto findById(String id);
    MemberDto findByIdAndPw(MemberDto memberDto);
    MemberDto findByEmail(String email);
    MemberDto findByIdAndEmail(MemberDto memberDto);
    void update(MemberDto memberDto);

}
