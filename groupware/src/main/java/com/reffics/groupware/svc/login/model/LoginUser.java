package com.reffics.groupware.svc.login.model;

import lombok.Data;

@Data
public class LoginUser {

    private String emplyId;

    private String emplyNo;

    private String emplyName;

    private String hpNo;

    private String pwd;

    private int pwdErrCnt;
}
