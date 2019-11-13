package com.babyfoodchef.dao;

import com.babyfoodchef.dto.LoginObjDto;
import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao{
    @Autowired
    MemberMapper memberMapper;

    @Override
    public void insert(MemberDto memberDto) {
        memberMapper.insert(memberDto);
    }

    @Override
    public MemberDto findByIdAndPw(LoginObjDto loginObj) {
        return memberMapper.findByIdAndPw(loginObj);
    }

    @Override
    public void update(MemberDto memberDto) {
        memberMapper.update(memberDto);
    }

    @Override
    public MemberDto findById(String id) {
        return memberMapper.findById(id);
    }
}
