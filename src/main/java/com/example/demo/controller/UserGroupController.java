package com.example.demo.controller;

import com.example.demo.Model.UserGroup;
import com.example.demo.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserGroupController {
    @Autowired
    private UserGroupService userGroupService;
    //일정 조회
    @RequestMapping(value ="friendAdd", method = RequestMethod.GET)
    public String getSelectList(UserGroup userGroup){

        return userGroupService.insert(userGroup);
    }

}
