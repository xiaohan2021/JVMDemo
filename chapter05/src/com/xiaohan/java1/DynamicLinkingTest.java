package com.xiaohan.java1;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/19
 */
public class DynamicLinkingTest {

    int num = 10;

    public void methodA(){
        System.out.println("methodA()....");
    }

    public void methodB(){
        System.out.println("methodB()....");

        methodA();

        num++;
    }

}
