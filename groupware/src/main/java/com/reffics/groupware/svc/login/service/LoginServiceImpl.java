package com.reffics.groupware.svc.login.service;

import com.reffics.groupware.config.exception.RefficsException;
import com.reffics.groupware.svc.login.mapper.LoginMapper;
import com.reffics.groupware.svc.login.model.LoginParam;
import com.reffics.groupware.svc.login.model.LoginUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;



    @Override
    public LoginUser selectLoginUser(LoginParam loginParam) {
        LoginUser loginUser = loginMapper.selectLoginUser(loginParam);

        if(loginUser == null) {
            throw new RefficsException("FAIL00001", "일치하는 사용자 정보가 없습니다.");
        }

        if(loginUser.getPwdErrCnt() > 4) {
            throw new RefficsException("FAIL00003", "비밀번호 오류 횟수 초과입니다.\n관리자에게 문의 하세요");
        }

        if(!loginUser.getPwd().equals(loginParam.getLoginPw())) {
            loginMapper.updateErrorPasswdCount(loginParam);
            throw new RefficsException("FAIL00002", "일치하는 사용자 정보가 없습니다.");
        }

        if(loginUser.getPwdErrCnt() > 0) {
            loginMapper.updateInitPasswdCount(loginParam);
        }

        return loginUser;
    }
}
