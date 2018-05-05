package com.java.patterns.builder;

/**
 * 宝马汽车制造抽象
 *
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public abstract class BMWBuilder {

    protected abstract void builderChassis();  //底盘
    protected abstract void builderWheel();    //轮毂
    protected abstract void builderEngine();   //引擎
    protected abstract void builderFrame();    //车架

    protected abstract BMWCar getCar();        //获取汽车成品
}
