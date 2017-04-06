package com.it.type;

import com.it.type.one.GenericClass;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * http://developer.51cto.com/art/201103/250028.htm
 * http://blog.csdn.net/a327369238/article/details/52621043
 * http://blog.csdn.net/sinat_29581293/article/details/52227953
 * Created by piguanghua on 2017/3/9.
 */
public class TypeMain {


    static public void main(String[] args) throws Exception {
        TypeMain.methodGeneric();
    }

    private static Class getClass(Type type, int i) {
        if (type instanceof ParameterizedType) { // 处理泛型类型
            return getGenericClass((ParameterizedType) type, i);
        } else if (type instanceof TypeVariable) {
            return (Class) getClass(((TypeVariable) type).getBounds()[0], 0); // 处理泛型擦拭对象
        } else {// class本身也是type，强制转型
            return (Class) type;
        }
    }

    private static Class getGenericClass(ParameterizedType parameterizedType, int i) {
        Object genericClass = parameterizedType.getActualTypeArguments()[i];
        if (genericClass instanceof ParameterizedType) { // 处理多级泛型
            return (Class) ((ParameterizedType) genericClass).getRawType();
        } else if (genericClass instanceof GenericArrayType) { // 处理数组泛型
            return (Class) ((GenericArrayType) genericClass).getGenericComponentType();
        } else if (genericClass instanceof TypeVariable) { // 处理泛型擦拭对象
            return (Class) getClass(((TypeVariable) genericClass).getBounds()[0], 0);
        } else {
            return (Class) genericClass;
        }
    }

    private static void classGeneric() {
        System.out.println("\n--------------------- classGeneric ---------------------");
        GenericClass gc = new GenericClass();
        Type[] gis = gc.getClass().getGenericInterfaces(); // 接口的泛型信息
        Type gps = gc.getClass().getGenericSuperclass(); // 父类的泛型信息
        TypeVariable[] gtr = gc.getClass().getTypeParameters(); // 当前接口的参数信息
        System.out.println("============== getGenericInterfaces");
        for (Type t : gis) {
            System.out.println(t + " : " + getClass(t, 0));
        }
        System.out.println("============== getGenericSuperclass");
        System.out.println(getClass(gps, 0));
        System.out.println("============== getTypeParameters");
        for (TypeVariable t : gtr) {
            StringBuilder stb = new StringBuilder();
            for (Type tp : t.getBounds()) {
                stb.append(tp + " : ");
            }

            System.out.println(t + " : " + t.getName() + " : " + stb);
        }

    }

    private static void methodGeneric() throws Exception {
        System.out.println("\n--------------------- methodGeneric ---------------------");
        GenericClass gc = new GenericClass();
        Method method3 = gc.getClass().getDeclaredMethod("methodGeneric", new Class[] { Object.class });

        Type[] gpt3 = method3.getGenericParameterTypes();
        Type[] get3 = method3.getGenericExceptionTypes();
        Type gt3 = method3.getGenericReturnType();
        System.out.println("============== getGenericParameterTypes");
        for (Type t : gpt3) {
            System.out.println(t + " : " + getClass(t, 0));
        }
        System.out.println("============== getGenericExceptionTypes");
        for (Type t : get3) {
            System.out.println(t + " : " + getClass(t, 0));
        }
        System.out.println("============== getType");
        System.out.println(gt3 + " : " + getClass(gt3, 0));
    }

    private static void fieldGeneric() throws Exception {
        System.out.println("\n--------------------- fieldGeneric ---------------------");
        GenericClass gc = new GenericClass();
        Field field = gc.getClass().getSuperclass().getDeclaredField("result");

        Type gt = field.getGenericType();
        Type ft = field.getType();
        System.out.println("============== getGenericType");
        System.out.println(gt + " : " + getClass(gt, 0));
        System.out.println("============== getType");
        System.out.println(ft + " : " + getClass(ft, 0));
    }

}
