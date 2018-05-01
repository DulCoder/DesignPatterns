package com.java.patterns.simplefactory;

/**
 * Created by zhengxianyou on 2018/4/29 0029.
 */
public abstract class Operation {
   protected double number_x = 0;
   protected double number_y = 0;

    public Operation(double number_x, double number_y) {
        this.number_x = number_x;
        this.number_y = number_y;
    }

    public abstract double getResult();

}
