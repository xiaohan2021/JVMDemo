package com.xiaohan.java;

/**
 *
 * @Description: 演示栈中的异常:StackOverflowError
 * @Author: 小韩同学
 * @Date: 2020/11/19
 *
 *  默认情况下：count : 11419
 *  设置栈的大小： -Xss256k : count : 2473
 */
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }

}
