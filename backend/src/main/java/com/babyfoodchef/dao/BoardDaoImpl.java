package com.babyfoodchef.dao;

import com.babyfoodchef.dto.FreeBoardDto;
import com.babyfoodchef.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<FreeBoardDto> freeBoardFindAll() {
        return boardMapper.freeBoardFindAll();
    }
}
