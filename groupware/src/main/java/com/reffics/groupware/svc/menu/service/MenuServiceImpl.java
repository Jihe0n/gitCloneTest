package com.reffics.groupware.svc.menu.service;

import com.reffics.groupware.svc.menu.mapper.MenuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public String getUserMenus(String emplyId) {
        String data = menuMapper.selectUserMenuList(emplyId);
        return data;
    }
}
