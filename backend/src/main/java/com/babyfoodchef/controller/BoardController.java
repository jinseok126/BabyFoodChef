package com.babyfoodchef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.babyfoodchef.dto.FreeBoardDto;
import com.babyfoodchef.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/free/findAll")
    public List<FreeBoardDto> freeBoardFindAll() {
        List<FreeBoardDto> freeBoardList = boardService.freeBoardFindAll();
        return freeBoardList;
    }
}
