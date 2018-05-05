package com.java.patterns.templatemethod;

/**
 * 试题抽象类
 *
 * Created by zhengxianyou on 2018/5/2 0002.
 */
public abstract class TestPage {

    protected void name(){
        System.out.println("班级_姓名："+studentName());
    }

    protected void question1(){
        System.out.println("试题1 答案："+answer1());
    }

    protected void question2(){
        System.out.println("试题2 答案："+answer2());
    }

    protected void question3(){
        System.out.println("试题3 答案："+answer3());
    }


    protected abstract String studentName();
    protected abstract String answer1();
    protected abstract String answer2();
    protected abstract String answer3();

}
