package com.xiaohan.java;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/19
 */
class Father {
    public static void print(String str) {
        System.out.println("father " + str);
    }
    private void show(String str) {
        System.out.println("father " + str);
    }
}
class Son extends Father {
}
public class VirtualMethodTest {
    public static void main(String[] args) {
        Son.print("coder");
        //Father fa = new Father();
        //fa.show("cooooder");
    }
}
