package com.reffics.groupware.svc.user.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private String emplyId;

    private String emplyNo;

    private String emplyName;

    private String hpNo;

}
