package com.it.train;

/**
 * Created by 55 on 2016/6/11.
 */
/**
 *  Object equals()��== ����
 *  ��ʱ�����дequals����
 *  �������͵ı����Ͷ�������ñ����������ں�����ջ�ڴ����
 *  ���ڴ�����new�����Ķ��������
 *  ������ ��ų���
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
