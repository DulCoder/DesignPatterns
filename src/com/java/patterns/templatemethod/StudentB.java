package com.java.patterns.templatemethod;

/**
 * Created by zhengxianyou on 2018/5/2 0002.
 */
public class StudentB extends TestPage {
    @Override
    protected String studentName() {
        return "三年级一班：张旺旺";
    }

    @Override
    protected String answer1() {
        return "D";
    }

    @Override
    protected String answer2() {
        return "C";
    }

    @Override
    protected String answer3() {
        return "A";
    }
}
