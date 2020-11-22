package com.xiaohan.java2;

/**
 * 同步省略说明
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/22
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized(hollis) {
            System.out.println(hollis);
        }
    }
}
