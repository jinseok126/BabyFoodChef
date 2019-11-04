package com.babyfoodchef.service;

import com.babyfoodchef.dto.MemberDto;
import org.springframework.stereotype.Service;

public interface MemberService {
    void insert(MemberDto memberDto);
}