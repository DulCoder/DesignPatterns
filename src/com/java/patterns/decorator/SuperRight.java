package com.java.patterns.decorator;

import com.java.patterns.decorator.impl.UserRights;

/**
 * 超级会员特权
 *
 * Created by zhengxianyou on 2018/4/30 0030.
 */
public class SuperRight extends UserRights {

    @Override
    public void RightContent() {
        super.RightContent();
        System.out.println("扩容特权");
        System.out.println("无限加速特权");
    }
}
