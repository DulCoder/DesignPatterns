package com.java.patterns.decorator;

import com.java.patterns.decorator.impl.User;

/**
 * 装饰模式
 *
 * 定义：装饰模式指的是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。
 * 它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 *
 *组成：①抽象构件（Component）角色：给出一个抽象接口，以规范准备接收附加责任的对象。
 * ②具体构件（Concrete Component）角色：定义一个将要接收附加责任的类。
 * ③装饰（Decorator）角色：持有一个构件（Component）对象的实例，并实现一个与抽象构件接口一致的接口。
 * ④具体装饰（Concrete Decorator）角色：负责给构件对象添加上附加的责任。
 *
 * 特点：①装饰对象和真实对象有相同的接口。这样客户端对象就能以和真实对象相同的方式和装饰对象交互。
 * ②装饰对象包含一个真实对象的引用（reference）
 * ③装饰对象接受所有来自客户端的请求。它把这些请求转发给真实的对象。
 * ④ 装饰对象可以在转发这些请求以前或以后增加一些附加功能。这样就确保了在运行时，
 * 不用修改给定对象的结构就可以在外部增加附加的功能。在面向对象的设计中，通常是通过继承来实现对给定类的功能扩展。
 *
 * 优点：①Decorator模式与继承关系的目的都是要扩展对象的功能，但是Decorator可以提供比继承更多的灵活性。
 * ②通过使用不同的具体装饰类以及这些装饰类的排列组合，设计师可以创造出很多不同行为的组合。
 *
 * 缺点：①这种比继承更加灵活机动的特性，也同时意味着更加多的复杂性。
 * ②装饰模式会导致设计中出现许多小类，如果过度使用，会使程序变得很复杂。
 * ③装饰模式是针对抽象组件（Component）类型编程。但是，如果你要针对具体组件编程时，就应该重新思考你的应用架构，
 * 以及装饰者是否合适。当然也可以改变Component接口，增加新的公开的行为，实现“半透明”的装饰者模式。在实际项目中要做出最佳选择。
 *
 * 应用场景：①需要扩展一个类的功能，或给一个类添加附加职责。
 * ② 需要动态的给一个对象添加功能，这些功能可以再动态的撤销。
 * ③需要增加由一些基本功能的排列组合而产生的非常大量的功能，从而使继承关系变的不现实。
 * ④当不能采用生成子类的方法进行扩充时。一种情况是，可能有大量独立的扩展，为支持每一种组合将产生大量的子类，
 * 使得子类数目呈爆炸性增长。另一种情况可能是因为类定义被隐藏，或类定义不能用于生成子类。
 *
 * 设计原则：多用组合，少用继承。遵循开闭原则
 *
 * 简化情况：①如果只有一个Concrete Component类而没有抽象的Component接口时，可以让Decorator继承Concrete Component。
 * ②如果只有一个Concrete Decorator类时，可以将Decorator和Concrete Decorator合并。
 *
 * 案例：百度云 非会员、普通会员。超级会员 这三种用户的特权分配
 *
 * Created by zhengxianyou on 2018/4/30 0030.
 */
public class Decorator {

    public static void main(String[] args) {
        User user = new User("超级会员");
        BaseRight baseRight = new BaseRight();
        GeneralRight generalRight = new GeneralRight();
        SuperRight superRight = new SuperRight();

        baseRight.setRight(user);
        generalRight.setRight(baseRight);
        superRight.setRight(generalRight);

        superRight.RightContent();
    }

}
