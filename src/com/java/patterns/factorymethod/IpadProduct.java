package com.java.patterns.factorymethod;

/**
 * iPad产品
 *
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class IpadProduct extends Electronics {
    @Override
    void getElectronics() {
        System.out.println("生产iPad Pro");
    }
}
