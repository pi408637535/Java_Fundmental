package com.it.train;

/**
 * Created by 55 on 2016/6/11.
 */

/**
 *  ��������
 *  ����������ڣ�����--����--��ʼ��--ʹ��--ж��
 *  final�ؼ��ֵ����ã����Ӿֲ��������������ڣ�
 *      ������ӵģ����ڴ��п���һ�ݣ�һģһ���ľֲ����������ڲ������ʱ�����ʿ�������У�
 *      ��Ϊ�ǿ����ı����������ڲ��಻���޸�final������ֵ��
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

