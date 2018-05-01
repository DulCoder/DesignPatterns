package com.java.patterns.proxy;

/**
 * 买家
 *
 * Created by zhengxianyou on 2018/5/1 0001.
 */
public class Buyer {
    private String name;

    public Buyer(String name) {
        this.name = name;
        System.out.println("送货给买家："+name);
    }

    public String getName() {
        return name;
    }
}
