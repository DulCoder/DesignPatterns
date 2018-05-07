package com.java.patterns.abstractfactory;

import com.java.patterns.abstractfactory.factoryImpl.MeizuFactory;
import com.java.patterns.abstractfactory.factoryImpl.MiFactory;

/**
 * 抽象工厂模式
 *
 * 定义：提供一个创建一系列相关或互相依赖对象对的接口，而无需指定它们具体的类。
 * 抽象工厂模式是所有形态的工厂模式中最为抽象和最具一般性的一种形态。抽象工厂模式是指当有多个抽象角色时，
 * 使用的一种工厂模式。抽象工厂模式可以向客户端提供一个接口，使客户端在不必指定产品的具体的情况下，
 * 创建多个产品族中的产品对象。根据里氏替换原则，任何接受父类型的地方，都应当能够接受子类型。
 * 因此，实际上系统所需要的，仅仅是类型与这些抽象产品角色相同的一些实例，而不是这些抽象产品的实例。
 * 换言之，也就是这些抽象产品的具体子类的实例。工厂类负责创建抽象产品的具体子类的实例。
 *
 * 优点：① 它分离了具体的类
 * ② 它使得易于交换产品系列
 * ③ 它有利于产品的一致性
 *
 * 缺点：①难以支持新种类的产品
 *
 * 产品族：是指位于不同产品等级结构中，功能相关联的产品组成的家族。一般是位于不同的等级结构中的相同位置上。
 * 显然，每一个产品族中含有产品的数目，与产品等级结构的数目是相等的，形成一个二维的坐标系，
 * 水平坐标是产品等级结构，纵坐标是产品族。叫做相图。
 *
 * 当有多个不同的等级结构的产品时，如果使用工厂方法模式就势必要使用多个独立的工厂等级结构来对付这些产品的等级结构。
 * 如果这些产品等级结构是平行的，会导致多个平行的工厂等级结构。
 * 抽象工厂模式使用同一个 工厂等级结构负责这些不同产品等级结构产品对象的创建。
 * 对于每一个产品族，都有一个具体工厂。而每一个具体工厂创建属于同一个产品族，但是分属于不同等级结构的产品。
 * 通过引进抽象工厂模式，可以处理具有相同（或者相似）等级结构的多个产品族中的产品对象的创建问题。
 *
 * 由于每个具体工厂角色都需要负责两个不同等级结构的产品对象的创建，因此每个工厂角色都需要提供两个工厂方法，
 * 分别用于创建两个等级结构的产品。既然每个具体工厂角色都需要实现这两个工厂方法，所以具有一般性，不妨抽象出来，移动到抽象工厂角色中加以声明。
 *
 *应用场景：① 系统不依赖于产品类实例如何被创建，组合和表达的细节。
 * ② 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品
 * ③ 同属于同一个产品族是在一起使用的。这一约束必须在系统的设计中体现出来。
 * ④ 系统提供一个产品类的库，所有产品以同样的接口出现，从而使客户端不依赖于实现。
 *
 * 案例：同时使用高通骁龙和联发科芯片生产手机的公司，如小米和魅族；
 *      在代工厂生产手机时就需要区分 该手机使用那种芯片，贴那个品牌的商标
 *      本案例试用两种方式来实现，其中反射方式去除了众多的工厂实现类代码量会较少
 *
 * <p>
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class AbstractFactory {

    public static void main(String[] args) {
        /**
         //常规方式
         PhoneFactory miFactory = new MiFactory();
         DragonChipVersion miDragon = miFactory.createPhoneDragon();
         MTKChipVersion miMTK = miFactory.createPhoneMtk();
         miDragon.showPhone();
         miMTK.showPhone();

         System.out.println();

         PhoneFactory meizuFactory = new MeizuFactory();
         DragonChipVersion meizuDragon = meizuFactory.createPhoneDragon();
         MTKChipVersion meizuMTK = meizuFactory.createPhoneMtk();
         meizuDragon.showPhone();
         meizuMTK.showPhone();
         */

        //反射方式(可省略工厂接口和众多实现类)
        String dragon = "com.java.patterns.abstractfactory.dragonImpl.";  //骁龙实现类包名
        String mtk = "com.java.patterns.abstractfactory.mtkImpl.";   //联发科实现类包名

        DragonChipVersion miDragon = (DragonChipVersion) ReflectFactory.getPhone(dragon + "MiDragon");
        miDragon.showPhone();
        MTKChipVersion miMTK = (MTKChipVersion) ReflectFactory.getPhone(mtk + "MiMTK");
        miMTK.showPhone();

        DragonChipVersion meizuDragon = (DragonChipVersion) ReflectFactory.getPhone(dragon + "MeizuDragon");
        meizuDragon.showPhone();
        MTKChipVersion meizuMTK = (MTKChipVersion) ReflectFactory.getPhone(mtk + "MeizuMTK");
        meizuMTK.showPhone();

    }

}
