package com.babyfoodchef.jwt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

public class JwtInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtService jwtService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String token = request.getHeader("Authorization");
        // check == true ? 사용가능한 토큰 : 사용 불가능한 토큰
        String returnToken = jwtService.checkToken(response, request, token);
        if (returnToken == null) {
            return false;
        }
        return true;
    }

}
