package com.java.patterns.observer.targetImpl;

import com.java.patterns.observer.Informer;
import com.java.patterns.observer.Target;

/**
 * 上课的老师
 *
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class Teacher implements Target {
    private Informer informer = new Informer();

    @Override
    public void action() {
        System.out.println("老师走下讲台，靠近学生......");
        informer.notifyObserver();
    }
}
