package com.java.patterns.observer;

import com.java.patterns.observer.iObserverImpl.StudentA;
import com.java.patterns.observer.iObserverImpl.StudentB;
import com.java.patterns.observer.targetImpl.HeadTeacher;
import com.java.patterns.observer.targetImpl.Teacher;

/**
 * 观察者模式
 *
 * 定义：一个目标物件管理所有相依于它的观察者物件，并且在它本身的状态改变时主动发出通知。
 *       这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。
 *
 * 过程：实现观察者模式有很多形式，比较直观的一种是使用一种“注册——通知——撤销注册”的形式。
 *
 * 组成：①观察者（Observer）将自己注册到被观察对象（Subject）中，被观察对象将观察者存放在一个容器（Container）里。
 *      ②被观察（target）被观察对象发生了某种变化（如图中的SomeChange），从容器中得到所有注册过的观察者，将变化通知观察者。
 *     ③撤销观察： 观察者告诉被观察者要撤销观察，被观察者从容器中将观察者去除。
 *
 * 使用：观察者将自己注册到被观察者的容器中时，被观察者不应该过问观察者的具体类型，而是应该使用观察者的接口。
 *      这样的优点是：假定程序中还有别的观察者，那么只要这个观察者也是相同的接口实现即可。一个被观察者可以对应多个观察者，
 *    当被观察者发生变化的时候，他可以将消息一一通知给所有的观察者。基于接口，而不是具体的实现——这一点为程序提供了更大的灵活性。
 *
 * 应用场景：①当一个对象的改变需要同时改变其他对象的时候
 *           ②一个抽象模型有两个方面，其中一个方面依赖于另一方面，这时用观察者模式可以将两者封装在独立的对象中使它们各自独立地改变和复用
 *
 * Created by zhengxianyou on 2018/5/6 0006.
 */
public class Observer {

    public static void main(String[] args) {
        Informer informer = new Informer();
        StudentA studentA = new StudentA();
        StudentB studentB = new StudentB();
        informer.add(studentA);
        informer.add(studentB);      //委托通知者告知异常情况

        Teacher teacher = new Teacher();
        HeadTeacher headTeacher = new HeadTeacher();
//        informer.delete(studentA);   //删除观察者

        teacher.action();     //老师和班主任行动
        System.out.println();
        headTeacher.action();
    }

}
