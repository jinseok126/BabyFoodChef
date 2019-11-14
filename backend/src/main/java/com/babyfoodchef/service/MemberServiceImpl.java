package com.babyfoodchef.service;

import com.babyfoodchef.dao.MemberDao;
import com.babyfoodchef.dto.LoginObjDto;
import com.babyfoodchef.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberDao memberDao;

    @Override
    public void insert(MemberDto memberDto){
        memberDao.insert(memberDto);
    }

    @Override
    public MemberDto findByIdAndPw(LoginObjDto loginObj) {
        return memberDao.findByIdAndPw(loginObj);
    }

    @Override
    public void update(MemberDto memberDto) {
        memberDao.update(memberDto);
    }

    @Override
    public MemberDto findById(String id) {
        return memberDao.findById(id);
    }

    @Override
    public MemberDto findByEmail(String email) {
        return memberDao.findByEmail(email);
    }

    @Override
    public MemberDto findByIdAndEmail(String id, String email) {
        return memberDao.findByIdAndEmail(id, email);
    }
}
