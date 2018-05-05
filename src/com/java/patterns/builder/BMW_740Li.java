package com.java.patterns.builder;

/**
 * 宝马740Li产线 具体建造者
 *
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public class BMW_740Li extends BMWBuilder {

    private BMWCar car = new BMWCar();

    @Override
    protected void builderChassis() {
        car.addParts("底盘C_长5.15米");
    }

    @Override
    protected void builderWheel() {
        car.addParts("轮毂C_18英寸");
    }

    @Override
    protected void builderEngine() {
        car.addParts("发动机_bmw027");
    }

    @Override
    protected void builderFrame() {
        car.addParts("车架C_高1.33米");
    }

    @Override
    protected BMWCar getCar() {
        return car;
    }
}
