package com.babyfoodchef.service;

import com.babyfoodchef.dao.BoardDao;
import com.babyfoodchef.dto.FreeBoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardDao boardDao;

    @Override
    public List<FreeBoardDto> freeBoardFindAll() {
        return boardDao.freeBoardFindAll();
    }

}
