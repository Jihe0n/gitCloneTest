package com.reffics.groupware.svc.login.mapper;

import com.reffics.groupware.svc.login.model.LoginParam;
import com.reffics.groupware.svc.login.model.LoginUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginMapper {
    LoginUser selectLoginUser(LoginParam loginParam);

    void updateErrorPasswdCount(LoginParam loginParam);

    void updateInitPasswdCount(LoginParam loginParam);
}
