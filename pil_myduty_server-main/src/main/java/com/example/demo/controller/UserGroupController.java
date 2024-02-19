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
        String userId = userGroup.getUSER_ID();
        String userIdFn = userGroup.getUSER_ID_FN();
        String message = null; // 메시지 초기화
        String message1 =  userGroupService.callFriendManagementProcedure(userId, userIdFn,message);
        return message1;
    }
    @RequestMapping(value ="friendSelect" ,method = RequestMethod.GET)
    public List<UserGroup> getFriendList(UserGroup userGroup){

        return userGroupService.select(userGroup);
    }
}
