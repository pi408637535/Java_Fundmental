package com.it.train;

/**
 * Created by 55 on 2016/6/11.
 */

import java.util.HashSet;

/**
 * ��ʵ��equals()��hashcode�����
 * ������һ��ʵ�飺if�жϵ�˳���Ǵ���---> �ҵ�
 */
public class Example4 {
    static public void main(String[] args) {
        int a = 2;
        int b = 3;
        if(++b == 3  && ++a == 2){
            System.out.println("a=" + a);
            System.out.println("b=" + b);
        }else{
            System.out.println("a=" + a);
            System.out.println("b=" + b);
        }

        /**
        *
        * for (Entry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }
        *
        * */
    }
}
