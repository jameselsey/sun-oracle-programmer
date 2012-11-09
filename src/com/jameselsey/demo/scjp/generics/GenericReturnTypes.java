package com.jameselsey.demo.scjp.generics;

/**
 * Author:  JElsey
 * Date:    04/11/2012
 */
public class GenericReturnTypes
{
    public static void main(String[] args)
    {

        System.out.println(findMax(1, 2, 3));
        System.out.println(findMax("hello", "world", "yay"));
    }

    public static <T extends Comparable<T>> T findMax(T a, T b, T c){
        T max = a;

        if (b.compareTo(a) > 0){
            max = b;
        }

        if(c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }
}
