package com.java.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 宝马汽车产品
 *
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public class BMWCar {

    private List<String> parts = new ArrayList<>();

    /**
     * 添加零部件
     *
     * @param part
     */
    public void addParts(String part){
        parts.add(part);
    }

    public void showCar(){
        System.out.println(parts.toString());
    }

}
