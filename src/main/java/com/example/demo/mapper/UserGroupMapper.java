package com.example.demo.mapper;

import com.example.demo.Model.UserGroup;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserGroupMapper
{
    List<UserGroup> select(UserGroup userGroup);
    List<UserGroup> findId(UserGroup userGroup);
    List<UserGroup> findPw(UserGroup userGroup);
    String insert(UserGroup userGroup);
}
