package com.java.patterns.abstractfactory.factoryImpl;

import com.java.patterns.abstractfactory.DragonChipVersion;
import com.java.patterns.abstractfactory.MTKChipVersion;
import com.java.patterns.abstractfactory.PhoneFactory;
import com.java.patterns.abstractfactory.dragonImpl.MeizuDragon;
import com.java.patterns.abstractfactory.mtkImpl.MeizuMTK;

/**
 * 魅族手机工厂
 *
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class MeizuFactory implements PhoneFactory {
    @Override
    public DragonChipVersion createPhoneDragon() {
        return new MeizuDragon();
    }

    @Override
    public MTKChipVersion createPhoneMtk() {
        return new MeizuMTK();
    }
}
