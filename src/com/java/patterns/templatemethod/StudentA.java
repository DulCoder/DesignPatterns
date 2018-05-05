package com.java.patterns.templatemethod;

/**
 * Created by zhengxianyou on 2018/5/2 0002.
 */
public class StudentA extends TestPage {

    @Override
    protected String studentName() {
        return "三年级二班：李子明";
    }

    @Override
    protected String answer1() {
        return "A";
    }

    @Override
    protected String answer2() {
        return "B";
    }

    @Override
    protected String answer3() {
        return "C";
    }
}
