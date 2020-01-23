package com.babyfoodchef.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.babyfoodchef.dto.FreeBoardDto;
import com.babyfoodchef.mapper.BoardMapper;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<FreeBoardDto> freeBoardFindAll() {
        return boardMapper.freeBoardFindAll();
    }
}
