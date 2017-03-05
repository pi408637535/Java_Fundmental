package com.it.train;

/**
 * Created by 55 on 2016/6/11.
 */
/**
 *  Object equals()与== 区别
 *  有时类会重写equals方法
 *  基本类型的变量和对象的引用变量，都是在函数的栈内存分配
 *  堆内存则存放new出来的对象和数组
 *  常量池 存放常量
 * */
public class Example1 {
    static public void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        s3.equals(s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
