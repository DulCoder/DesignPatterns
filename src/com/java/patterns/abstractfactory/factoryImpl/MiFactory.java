package com.java.patterns.abstractfactory.factoryImpl;

import com.java.patterns.abstractfactory.DragonChipVersion;
import com.java.patterns.abstractfactory.MTKChipVersion;
import com.java.patterns.abstractfactory.PhoneFactory;
import com.java.patterns.abstractfactory.dragonImpl.MiDragon;
import com.java.patterns.abstractfactory.mtkImpl.MiMTK;

/**
 * 小米手机工厂
 *
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class MiFactory implements PhoneFactory {
    @Override
    public DragonChipVersion createPhoneDragon() {
        return new MiDragon();
    }

    @Override
    public MTKChipVersion createPhoneMtk() {
        return new MiMTK();
    }
}
