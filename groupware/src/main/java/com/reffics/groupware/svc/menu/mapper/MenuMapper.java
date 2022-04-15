package com.reffics.groupware.svc.menu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MenuMapper {

    String selectUserMenuList(String emplyId);
}
