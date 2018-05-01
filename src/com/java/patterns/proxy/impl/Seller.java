package com.java.patterns.proxy.impl;

import com.java.patterns.proxy.Buyer;
import com.java.patterns.proxy.SendPackage;

/**
 * 卖家
 *
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class Seller implements SendPackage {
    private Buyer buyer;

    public Seller(Buyer buyer) {
        this.buyer = buyer;
        System.out.println("卖家发货！");
    }

    @Override
    public void sendCloth() {
        System.out.println(buyer.getName()+" 买了衣服！");
    }

    @Override
    public void sendFlower() {
        System.out.println(buyer.getName()+" 买了鲜花！");
    }

    @Override
    public void sendOthers() {
        System.out.println(buyer.getName()+" 买了其他物品！");
    }
}
