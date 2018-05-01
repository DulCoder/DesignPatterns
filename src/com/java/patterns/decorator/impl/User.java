package com.java.patterns.decorator.impl;

import com.java.patterns.decorator.Rights;

/**
 * 接受用户权利的载体类
 *
 * Created by zhengxianyou on 2018/4/30 0030.
 */
public class User implements Rights {
    private String userType;

    public User(String userType) {
        this.userType = userType;
    }

    @Override
    public void RightContent() {
        System.out.println("用户类型为："+userType);
    }
}
