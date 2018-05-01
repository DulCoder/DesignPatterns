package com.java.patterns.factorymethod.impl;

import com.java.patterns.factorymethod.Electronics;
import com.java.patterns.factorymethod.Foxconn;
import com.java.patterns.factorymethod.IphoneProduct;

/**
 * iPhone工厂
 *
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class IphoneFactory implements Foxconn {
    @Override
    public Electronics produceElectronics() {
        return new IphoneProduct();
    }
}
