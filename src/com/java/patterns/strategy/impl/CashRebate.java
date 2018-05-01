package com.java.patterns.strategy.impl;

import com.java.patterns.strategy.CashSuper;

/**
 * 打折收费
 *
 * Created by zhengxianyou on 2018/4/29 0029.
 */
public class CashRebate implements CashSuper {
    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*rebate;
    }
}
