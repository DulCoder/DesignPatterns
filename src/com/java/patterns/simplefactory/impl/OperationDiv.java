package com.java.patterns.simplefactory.impl;

import com.java.patterns.simplefactory.Operation;

/**
 * 除法运算
 *
 * Created by zhengxianyou on 2018/4/29 0029.
 */
public class OperationDiv extends Operation {

    public OperationDiv(double number_x, double number_y) {
        super(number_x, number_y);
    }

    @Override
    public double getResult() {
        if (number_y == 0){
            throw new RuntimeException("除数不能为 0");
        }
        return number_x/number_y;
    }
}
