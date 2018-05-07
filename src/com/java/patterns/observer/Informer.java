package com.java.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 告知者
 * <p>
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class Informer {
    private static List<IObserver> iObservers = new ArrayList<>();  //要定义为静态

    /**
     * 新增观察者（注册）
     *
     * @param iObserver
     */
    public void add(IObserver iObserver) {
        iObservers.add(iObserver);
    }

    /**
     * 删除观察者（取消注册）
     *
     * @param iObserver
     */
    public void delete(IObserver iObserver) {
        iObservers.remove(iObserver);
    }

    /**
     * 告知观察者
     */
    public void notifyObserver() {
        if (iObservers.size() > 0) {
            for (IObserver observer : iObservers) {
                observer.handle();
            }
        }
    }

}
