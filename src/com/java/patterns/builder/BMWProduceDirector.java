package com.java.patterns.builder;

/**
 * 宝马汽车生产指挥者（负责接收订单的人员）
 *
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public class BMWProduceDirector {

    /**
     * 建造汽车
     *
     * @param builder
     */
    public void Construct(BMWBuilder builder){
        builder.builderChassis();
        builder.builderWheel();
        builder.builderEngine();
        builder.builderFrame();
    }

}
