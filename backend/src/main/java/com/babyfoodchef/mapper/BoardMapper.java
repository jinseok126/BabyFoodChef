package com.babyfoodchef.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.babyfoodchef.dto.FreeBoardDto;

@Mapper
public interface BoardMapper {

    List<FreeBoardDto> freeBoardFindAll();
}
