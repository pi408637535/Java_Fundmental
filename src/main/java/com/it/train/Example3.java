package com.it.train;

/**
 * Created by 55 on 2016/6/11.
 */

/**
 * �Զ�װ�����Զ�����
 * �������η�Χ-127~128 java�Ὣ���л����Ա�����Interger����
 * ��int��ֵ��Integet װ
 * ��Integer��int���бȽ� ����
 *
 * equals(),�Ƚϵ��������������
 * == �Ƚ�����������õ�ַ
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
