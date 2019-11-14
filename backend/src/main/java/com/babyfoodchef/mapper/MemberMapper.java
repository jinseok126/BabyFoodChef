package com.babyfoodchef.mapper;

import com.babyfoodchef.dto.LoginObjDto;
import com.babyfoodchef.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void insert(MemberDto memberDto);
    MemberDto findById(String id);
    MemberDto findByIdAndPw(LoginObjDto loginObj);
    MemberDto findByEmail(String email);
    MemberDto findByIdAndEmail(String id, String email);
    void update(MemberDto memberDto);

}
