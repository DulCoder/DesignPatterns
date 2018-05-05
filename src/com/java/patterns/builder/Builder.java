package com.java.patterns.builder;

/**
 * 建造者模式
 *
 * 定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 *
 * 组成：① builder(抽象建造者)：为创建一个产品对象的各个部件指定抽象接口
 * ② ConcreteBuilder(具体建造者)：实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并 提供一个检索产品的接口
 * ③ Director(建造指挥者)：构造一个使用Builder接口的对象
 * ④Product(建造出来的具体产品)：表示被构造的复杂对象。
 * ConcreteBuilder创建该产品的内部表示并定义它的装配过程，包含定义组成部件的类，包括将这些部件装配成最终产品的接口
 *
 *应用场景：① 当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时
 * ② 当构造过程必须允许被构造的对象有不同表示时
 *
 * 案例：宝马不同型号汽车的生产；宝马汽车：具体产品；生产产线：抽象建造者；工厂收集4S店订单人员：建造指挥者；BMW X5汽车生产线：具体建造者
 *
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public class Builder {

    public static void main(String[] args) {
        BMWProduceDirector director = new BMWProduceDirector();  //收集订单的工作人员
        BMW_X5 x5 = new BMW_X5();          //宝马X5订单
        BMW_740Li Li740 = new BMW_740Li(); //宝马740Li订单

        System.out.println("宝马X5......");
        director.Construct(x5);          //制造宝马X5汽车
        BMWCar car_X5 = x5.getCar();
        car_X5.showCar();

        System.out.println();

        System.out.println("宝马740Li......");
        director.Construct(Li740);      //制造宝马740Li汽车
        BMWCar car_740Li = Li740.getCar();
        car_740Li.showCar();
    }
}
