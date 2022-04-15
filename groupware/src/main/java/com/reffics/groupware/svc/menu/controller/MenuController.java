package com.reffics.groupware.svc.menu.controller;

import com.reffics.groupware.config.QueryToObject;
import com.reffics.groupware.svc.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping(value = "/user-menus")
    public ResponseEntity<Object> getUserMenus(@QueryToObject String emplyId) {
        log.info("emplyId : {}", emplyId);

        String data = menuService.getUserMenus(emplyId);
        return ResponseEntity.ok(data);
    }
}
