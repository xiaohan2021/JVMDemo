package com.xiaohan.java;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/17
 */
public class ClinitTest {
    //任何一个类声明以后，内部至少存在一个类的构造器
    private int a = 1;
    private static int c = 3;
    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest(){
        a = 10;
        int d = 20;
    }

}
