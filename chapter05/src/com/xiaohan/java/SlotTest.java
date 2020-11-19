package com.xiaohan.java;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/19
 */
public class SlotTest {
    public void localVarl() {
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVar2() {
        {
            int a = 0;
            System.out.println(a);
        }
        //此时的b就会复用a的槽位
        int b = 0;
    }
}
