package com.jameselsey.demo.scjp.generics;

/**
 * Author:  JElsey
 * Date:    04/11/2012
 */
public class GenericMethods
{
    public static void main(String[] args)
    {
        Integer[] iray = {1, 2, 3, 4};
        Character[] cray = {'j', 'i', 'm'};

        printMe(iray);
        printMe(cray);
    }

    private static <T> void printMe(T[] type)
    {
        for (T t : type)
        {
            System.out.println(t);
        }
    }
}
