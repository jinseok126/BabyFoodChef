package com.babyfoodchef.mapper;

import com.babyfoodchef.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void insert(MemberDto memberDto);
    MemberDto findById(String id);
    MemberDto findByIdAndPw(MemberDto memberDto);
    MemberDto findByEmail(String email);
    MemberDto findByIdAndEmail(MemberDto memberDto);
    void update(MemberDto memberDto);

}
