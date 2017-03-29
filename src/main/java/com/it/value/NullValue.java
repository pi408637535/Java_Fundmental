package com.it.value;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by piguanghua on 3/29/17.
 * Java if判断是从左--> 右边
 * 一些错误的常见的Null或空值得判处
 * if (name == "") {
 //do something
 }

 2，错误用法二：
 if (name.equals("")) {
 //do something
 }


 3，错误用法三：
 if (！name.equals("")) {
 //do something
 }

 */
public class NullValue {
    static public void main(String[] args) {
        Integer totalShare = null;
        if( totalShare != null && totalShare == -1 ){
            System.out.println("tttt");
        }else {
            System.out.println("aaaa");
        }
    }
}
