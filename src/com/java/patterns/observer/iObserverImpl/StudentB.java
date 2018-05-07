package com.java.patterns.observer.iObserverImpl;

import com.java.patterns.observer.IObserver;

/**
 * 看课外书的学生
 *
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class StudentB implements IObserver {
    @Override
    public void handle() {
        System.out.println("看课外书的学生，收起课外书，打开课本......");
    }
}
