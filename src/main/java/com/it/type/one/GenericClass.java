package com.it.type.one;

/**
 * Created by piguanghua on 4/6/17.
 */
public class GenericClass extends BaseGenericInterface<Integer> implements GeneircInteface, CommonInteface{

    //@over
    public Integer methodCommon(Integer obj) {
        result = obj;
        return this.result;
    }

    @Override
    public <T> T methodGeneric(T obj) {
        return obj;
    }


}
