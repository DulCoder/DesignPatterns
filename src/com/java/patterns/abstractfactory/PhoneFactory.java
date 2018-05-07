package com.java.patterns.abstractfactory;

/**
 * 手机工厂
 *
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public interface PhoneFactory {
    DragonChipVersion createPhoneDragon();
    MTKChipVersion createPhoneMtk();
}
