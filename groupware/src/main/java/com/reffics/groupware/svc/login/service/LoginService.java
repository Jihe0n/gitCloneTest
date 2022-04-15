package com.reffics.groupware.svc.login.service;

import com.reffics.groupware.svc.login.model.LoginParam;
import com.reffics.groupware.svc.login.model.LoginUser;

public interface LoginService {

    LoginUser selectLoginUser(LoginParam loginParam);
}
