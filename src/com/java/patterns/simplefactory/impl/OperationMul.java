package com.java.patterns.simplefactory.impl;

import com.java.patterns.simplefactory.Operation;

/**
 * 乘法运算
 *
 * Created by zhengxianyou on 2018/4/29 0029.
 */
public class OperationMul extends Operation {

    public OperationMul(double number_x, double number_y) {
        super(number_x, number_y);
    }

    @Override
    public double getResult() {
        return number_x*number_y;
    }
}
