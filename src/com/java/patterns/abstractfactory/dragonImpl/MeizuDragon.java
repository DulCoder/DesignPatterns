package com.java.patterns.abstractfactory.dragonImpl;

import com.java.patterns.abstractfactory.DragonChipVersion;

/**
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class MeizuDragon implements DragonChipVersion {
    @Override
    public void showPhone() {
        System.out.println("魅族手机，骁龙版...");
    }
}
