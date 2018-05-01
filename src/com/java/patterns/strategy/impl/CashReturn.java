package com.java.patterns.strategy.impl;

import com.java.patterns.strategy.CashSuper;

/**
 * 返利收费（满减收费）
 *
 * Created by zhengxianyou on 2018/4/29 0029.
 */
public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        int num = (int) (money/moneyCondition);
        return (money-moneyReturn*num);
    }
}
