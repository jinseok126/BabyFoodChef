package com.babyfoodchef.mapper;

import com.babyfoodchef.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void insert(MemberDto memberDto);

}
