package com.babyfoodchef.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtInterceptor  implements HandlerInterceptor {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private  JwtProvider jwtProvider;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader("Authorization");

        // check == true ? 사용가능한 토큰 : 사용 불가능한 토큰
        String returnToken = jwtService.checkToken(response, request, token);

        if(returnToken == null) {
            return false;
        }
        return true;
    }

}
