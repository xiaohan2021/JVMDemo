package com.xiaohan.java;

/**
 * -Xms10m -Xmx10m
 *
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/22
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }

}
