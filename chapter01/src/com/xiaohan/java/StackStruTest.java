package com.xiaohan.java;

import java.sql.SQLOutput;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/16
 */
public class StackStruTest {
    public static void main(String[] args) {
        // int i = 2 + 3;
        int i = 2;
        int j = 3;
        int k = i + j;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}
