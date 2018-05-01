package com.java.patterns.strategy.impl;

import com.java.patterns.strategy.CashSuper;

/**
 * 正常收费
 *
 * Created by zhengxianyou on 2018/4/29 0029.
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
