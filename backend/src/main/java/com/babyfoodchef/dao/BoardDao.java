package com.babyfoodchef.dao;

import com.babyfoodchef.dto.FreeBoardDto;

import java.util.List;

public interface BoardDao {
    List<FreeBoardDto> freeBoardFindAll();
}
