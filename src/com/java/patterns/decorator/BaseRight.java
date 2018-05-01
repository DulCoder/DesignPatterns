package com.java.patterns.decorator;

import com.java.patterns.decorator.impl.UserRights;

/**
 * 非会员特权
 *
 * Created by zhengxianyou on 2018/4/30 0030.
 */
public class BaseRight extends UserRights {
    @Override
    public void RightContent() {
        super.RightContent();
        System.out.println("上传和下载功能");
    }
}
