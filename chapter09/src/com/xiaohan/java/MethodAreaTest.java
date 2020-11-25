package com.xiaohan.java;

/**
 * non-final的类变量
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/25
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }
}

class Order {
    public static int count = 1;
    public static final int number = 2;


    public static void hello() {
        System.out.println("hello!");
    }
}

