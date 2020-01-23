package com.babyfoodchef.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.babyfoodchef.dto.MemberDto;
import com.babyfoodchef.mapper.MemberMapper;

@Repository
public class MemberDaoImpl implements MemberDao {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public void insert(MemberDto memberDto) {
        memberMapper.insert(memberDto);
    }

    @Override
    public MemberDto findByIdAndPw(MemberDto memberDto) {
        return memberMapper.findByIdAndPw(memberDto);
    }

    @Override
    public void update(MemberDto memberDto) {
        memberMapper.update(memberDto);
    }

    @Override
    public MemberDto findById(String id) {
        return memberMapper.findById(id);
    }

    @Override
    public MemberDto findByEmail(String email) {
        return memberMapper.findByEmail(email);
    }

    @Override
    public MemberDto findByIdAndEmail(MemberDto memberDto) {
        return memberMapper.findByIdAndEmail(memberDto);
    }
}
