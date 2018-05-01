package com.java.patterns.proxy.impl;

import com.java.patterns.proxy.Buyer;
import com.java.patterns.proxy.SendPackage;

/**
 * 快递小哥（代理者）
 * <p>
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class Courier implements SendPackage {
    private Seller seller;

    public Courier(Buyer buyer) {
        seller = new Seller(buyer);
        System.out.println("快递小哥开始送货！");
    }

    @Override
    public void sendCloth() {
        seller.sendCloth();
    }

    @Override
    public void sendFlower() {
        seller.sendFlower();
    }

    @Override
    public void sendOthers() {
        seller.sendOthers();
    }
}
