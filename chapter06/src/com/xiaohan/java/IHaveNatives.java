package com.xiaohan.java;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/22
 */
public class IHaveNatives {
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;

}
