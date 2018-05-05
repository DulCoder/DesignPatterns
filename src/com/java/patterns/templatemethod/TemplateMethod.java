package com.java.patterns.templatemethod;

/**
 * 模板方法模式
 *
 *定义：定义一个操作中的算法骨架，而将一些步骤延迟到子类中，
 * 使得子类不可以改变算法的结构既可以重定义该算法的某些特定步骤
 *
 *优点：①封装不变部分，扩展可变部分
 * ②提取公共代码，便于维护
 * ③行为由父类控制，子类实现
 *
 * 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大
 *
 * 应用场景：①有多个子类共有的方法，且逻辑相同
 * ②重要的、复杂的方法，可以考虑作为模板方法
 *
 * 注意事项：为防止恶意操作，一般模板方法都加上 final 关键词
 *
 * 案例：学生考试试卷：所有学生拿到试卷都一样，但试题的答案却不尽相同；个人信息肯定不同
 *
 * Created by zhengxianyou on 2018/5/2 0002.
 */
public class TemplateMethod {

    public static void main(String[] args) {

        System.out.println("期末考试开始阅卷......");
        TestPage studentA = new StudentA();
        studentA.name();
        studentA.question1();
        studentA.question2();
        studentA.question3();

        TestPage studentB = new StudentB();
        studentB.name();
        studentB.question1();
        studentB.question2();
        studentB.question3();
    }

}
