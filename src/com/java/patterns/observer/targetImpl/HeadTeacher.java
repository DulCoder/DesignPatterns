package com.java.patterns.observer.targetImpl;

import com.java.patterns.observer.Informer;
import com.java.patterns.observer.Target;

/**
 * 班主任
 *
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class HeadTeacher implements Target {
    private Informer informer = new Informer();

    @Override
    public void action() {
        System.out.println("班主任靠近窗口，查看班级学生上课情况......");
        informer.notifyObserver();
    }
}
