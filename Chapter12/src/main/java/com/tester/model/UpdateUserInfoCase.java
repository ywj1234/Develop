package com.tester.model;

import lombok.Data;

@Data
public class UpdateUserInfoCase {

    private Integer id;
    private Integer userId;
    private String userName;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;

}
