package com.babyfoodchef.dao;

import java.util.List;

import com.babyfoodchef.dto.FreeBoardDto;

public interface BoardDao {
    List<FreeBoardDto> freeBoardFindAll();
}
