package com.java.patterns.abstractfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by zhengxianyou on 2018/5/7 0007.
 */
public class ReflectFactory {

    /**
     * 构建实例对象
     *
     * @return
     */
    public static Object getPhone(String className) {
        //通过类加载器获取产品类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            Class<?> clazz = loader.loadClass(className);
            //获取类的默认构造器对象并通过它实例化产品类
             Constructor<?> constructor = clazz.getDeclaredConstructor((Class[])null);
             return constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("该产品不存在！");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println("未找到相应构造器！");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("私有方法无法访问！");
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("构造实例失败，请确认构造器是否正确！");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("调用目标不存在！");
        }

        return null;
    }

}
