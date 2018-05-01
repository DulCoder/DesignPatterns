package com.java.patterns.factorymethod.impl;

import com.java.patterns.factorymethod.Electronics;
import com.java.patterns.factorymethod.Foxconn;
import com.java.patterns.factorymethod.MacProduct;

/**
 * MacBook工厂
 *
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class MacFactory implements Foxconn {
    @Override
    public Electronics produceElectronics() {
        return new MacProduct();
    }
}
