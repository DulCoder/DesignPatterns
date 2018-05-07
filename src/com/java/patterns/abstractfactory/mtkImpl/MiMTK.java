package com.java.patterns.abstractfactory.mtkImpl;

import com.java.patterns.abstractfactory.MTKChipVersion;

/**
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class MiMTK implements MTKChipVersion {
    @Override
    public void showPhone() {
        System.out.println("小米手机，联发科版...");
    }
}
