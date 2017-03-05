package com.it.train;

/**
 * Created by 55 on 2016/6/11.
 */

/**
 *  生命周期
 *  类的生命周期：加载--连接--初始化--使用--卸载
 *  final关键字的作用：增加局部变量的生存周期，
 *      如何增加的：在内存中拷贝一份，一模一样的局部变量，放内部类访问时，访问拷贝类就行，
 *      因为是拷贝的变量，所以内部类不能修改final变量的值。
 * */
public class Example2 extends Thread{
    public void mRun(final String name){
        new Runnable() {

            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        };
    }

    static public void main(String[] args) {

    }
}

