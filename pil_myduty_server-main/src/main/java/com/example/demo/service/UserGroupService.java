package com.example.demo.service;
import com.example.demo.Model.Calendar;
import com.example.demo.Model.UserGroup;
import com.example.demo.mapper.UserGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
@Service
@Transactional
public class UserGroupService {
    @Autowired
    private final UserGroupMapper userGroupMapper;

    @Autowired
    public UserGroupService(UserGroupMapper userGroupMapper) {
        this.userGroupMapper = userGroupMapper;
    }

    public String callFriendManagementProcedure(String userId, String userIdFn,String message) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("_USER_ID", userId);
        parameters.put("_USER_ID_FN", userIdFn);
        parameters.put("_MESSAGE", message); // _MESSAGE 파라미터 초기화
        userGroupMapper.callFriendManagementProcedure(parameters);
        return (String) parameters.get("_MESSAGE");
    }
    public List<UserGroup> select(UserGroup userGroup) {
        List<UserGroup> userGroupList;
        userGroupList = userGroupMapper.select(userGroup);

        return userGroupList;
    }
}
