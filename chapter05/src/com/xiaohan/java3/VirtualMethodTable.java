package com.xiaohan.java3;

/**
 * 虚方法表的举例
 *
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/22
 */
interface Friendly {
    void sayHello();
    void sayGoodbye();
}
class Dog {
    public void sayHello() {
    }
    public String toString() {
        return "Dog";
    }
}
class Cat implements Friendly {
    public void eat() {
    }
    public void sayHello() {
    }
    public void sayGoodbye() {
    }
    protected void finalize() {
    }
    public String toString(){
        return "Cat";
    }
}

class CockerSpaniel extends Dog implements Friendly {
    public void sayHello() {
        super.sayHello();
    }
    public void sayGoodbye() {
    }
}

public class VirtualMethodTable {
}
