package com.java.patterns.decorator.impl;

import com.java.patterns.decorator.Rights;

/**
 * 用于扩展用户权利的功能类
 *
 * Created by zhengxianyou on 2018/4/30 0030.
 */
public class UserRights implements Rights {
    protected Rights right;

    public void setRight(Rights right) {
        this.right = right;
    }

    @Override
    public void RightContent() {
        if (null != right){
            right.RightContent();
        }
    }
}
