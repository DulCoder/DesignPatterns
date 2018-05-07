package com.java.patterns.abstractfactory.mtkImpl;

import com.java.patterns.abstractfactory.MTKChipVersion;

/**
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class MeizuMTK implements MTKChipVersion {
    @Override
    public void showPhone() {
        System.out.println("魅族手机，联发科版...");
    }
}
