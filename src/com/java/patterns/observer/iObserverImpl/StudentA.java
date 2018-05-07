package com.java.patterns.observer.iObserverImpl;

import com.java.patterns.observer.IObserver;

/**
 * 睡觉的学生
 *
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class StudentA implements IObserver{
    @Override
    public void handle() {
        System.out.println("睡觉的学生，停止睡觉，看课本......");
    }
}
