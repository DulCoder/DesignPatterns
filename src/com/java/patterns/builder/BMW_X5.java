package com.java.patterns.builder;

/**
 * 宝马X5产线  具体建造者
 *
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public class BMW_X5 extends BMWBuilder {

    private BMWCar car = new BMWCar();

    @Override
    protected void builderChassis() {
        car.addParts("底盘A_长4.85米");
    }

    @Override
    protected void builderWheel() {
       car.addParts("轮毂A_19英寸");
    }

    @Override
    protected void builderEngine() {
          car.addParts("发动机_bmw001");
    }

    @Override
    protected void builderFrame() {
            car.addParts("车架A_高1.55米");
    }

    @Override
    protected BMWCar getCar() {
        return car;
    }
}
