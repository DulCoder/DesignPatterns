package com.java.patterns.factorymethod;

/**
 * iPhone产品
 *
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class IphoneProduct extends Electronics {
    @Override
    void getElectronics() {
        System.out.println("生产iPhone X");
    }
}
