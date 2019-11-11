package com.babyfoodchef.dao;

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
}