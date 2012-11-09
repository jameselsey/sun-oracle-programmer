package com.jameselsey.demo.scjp.assignments;

/**
 * Author:  JElsey
 * Date:    11/10/2012
 */
public enum EnumWithPrivateVar
{
    NORTH('N'), WEST('W'), EAST('W'), SOUTH('S');

    private char initial;

    EnumWithPrivateVar(char initial)
    {
        this.initial = initial;
    }
}

class Runner
{
    static EnumWithPrivateVar myEnum = EnumWithPrivateVar.NORTH;

    public static void main(String[] args)
    {
//        System.out.println("" + myEnum.NORTH.initial);
    }
}
