package com.reffics.groupware.svc.login.controller;

import com.reffics.groupware.svc.login.model.LoginParam;
import com.reffics.groupware.svc.login.model.LoginUser;
import com.reffics.groupware.svc.login.service.LoginService;
import com.reffics.groupware.svc.user.model.UserInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.PageAttributes.MediaType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;
    
    

    @PostMapping(value = "/login")
    public ResponseEntity<Object> selectLoginUser(LoginParam loginParam, HttpServletRequest request) {

        UserInfo userInfo = null;

        LoginUser loginUser = loginService.selectLoginUser(loginParam);
        userInfo = new UserInfo();
        userInfo.setEmplyId(loginUser.getEmplyId());
        userInfo.setEmplyName(loginUser.getEmplyName());
        userInfo.setEmplyNo(loginUser.getEmplyNo());
        userInfo.setHpNo(loginUser.getHpNo());

        HttpSession session = request.getSession();
        session.setAttribute("userInfo", userInfo);

        return ResponseEntity.ok(userInfo);
    }

    @GetMapping(value = "/login/user")
    public ResponseEntity<Object> getCurrentLoginUser(UserInfo userInfo) {
        log.info("userInfo : {}", userInfo);
        return ResponseEntity.ok(userInfo);
    }
    

	  
}
