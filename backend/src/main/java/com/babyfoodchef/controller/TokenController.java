package com.babyfoodchef.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {

    //토큰 검증, WebMvcConfig에 의해 JwtInterceptor로 간다.
    @GetMapping("/validateToken")
    public void validateToken() {
    }
}
