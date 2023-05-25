package com.example.ontap22_5.controller;

import com.example.ontap22_5.entity.Menu;
import com.example.ontap22_5.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class MenuController {
    @Autowired
    MenuRepo menuRepo;
    @PostMapping("/menu")
    public Menu insertMenu(@RequestBody Menu menus){
        return menuRepo.save(menus);
    }

}
