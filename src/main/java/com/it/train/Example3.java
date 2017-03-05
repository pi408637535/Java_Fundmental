package com.it.train;

/**
 * Created by 55 on 2016/6/11.
 */

/**
 * 自动装箱与自动拆箱
 * 对于整形范围-127~128 java会将进行缓存以保存其Interger对象
 * 将int赋值给Integet 装
 * 将Integer与int进行比较 拆箱
 *
 * equals(),比较的是两对象的内容
 * == 比较两对象的引用地址
 * */
public class Example3 {
    static public void main(String[] args) {

        Integer a = new Integer(1000);
        int b = 1000;
        Integer c = new Integer(10);
        Integer d = new Integer(10);
        System.out.println(a == b);
        System.out.println(c == d);


    }
}
