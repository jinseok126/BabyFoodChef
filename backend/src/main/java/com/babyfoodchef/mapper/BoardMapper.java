package com.babyfoodchef.mapper;

import com.babyfoodchef.dto.FreeBoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<FreeBoardDto> freeBoardFindAll();
}
