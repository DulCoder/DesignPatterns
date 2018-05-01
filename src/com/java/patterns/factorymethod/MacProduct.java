package com.java.patterns.factorymethod;

/**
 * MacBook产品
 *
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class MacProduct extends Electronics {
    @Override
    void getElectronics() {
        System.out.println("生产MacBook Pro");
    }
}
