package com.java.patterns.facade;

/**
 * 外观模式
 * <p>
 * 定义：为子系统中的一组接口提供一个一致的界面，
 * 此模式顶一个一个高层接口，这个接口使得这一子系统更加容易使用
 * <p>
 * 组成：①外观：为子系统提供一个共同的对外接口
 * ②客户对象：通过一个外观接口读写子系统中各接口的数据资源
 * <p>
 * 优点：①实现了子系统与客户端之间的松耦合关系
 * ②客户端屏蔽了子系统组件，减少了客户端所需处理的对象数目，并使得子系统使用起来更加容易
 * <p>
 * 应用场景：①设计初期阶段，应该有意识的将不同层分离，层与层之间建立外观模式
 * ②开发阶段，子系统越来越复杂，增加外观模式提供一个简单的调用接口
 * ③维护一个大型遗留系统的时候，可能这个系统已经非常难以维护和扩展，
 * 但又包含非常重要的功能，为其开发一个外观类，以便新系统与其交互
 * <p>
 * 案例：顾客通过肯德基前台点各种套餐，不同的单品食物组成套餐之后转到前台交给顾客
 * <p>
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public class Facade {

    public static void main(String[] args) {
        OrderTable orderTable = new OrderTable();

        orderTable.familyBucket();   //全家桶

        System.out.println();

        orderTable.SinglePackage();  //单人套餐
    }

}
