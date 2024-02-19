package com.example.demo.Model;

import lombok.Data;

@Data
public class UserGroup {
//    사용자아이디
    private String USER_ID;
//    친구아이디
    private String USER_ID_FN;
    //    생성일자
    private String CREATE_DATE;
    //    생성자
    private String CREATE_ID;
    //    수정일자
    private String UPDATE_DATE;
    //    수정자
    private String UPDATE_ID;
}
