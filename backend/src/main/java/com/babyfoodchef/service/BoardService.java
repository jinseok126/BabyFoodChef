package com.babyfoodchef.service;

import com.babyfoodchef.dto.FreeBoardDto;

import java.util.List;

public interface BoardService {
    List<FreeBoardDto> freeBoardFindAll();
}
