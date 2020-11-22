package com.xiaohan.java2;

/**
 * 体会invokedynamic指令
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/21
 */
@FunctionalInterface
interface Func {
    public boolean func(String str);
}

public class Lambda {
    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        Func func = s -> {
            return true;
        };

        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }
}

