package com.jameselsey.demo.scjp.assignments;

/**
 * Author:  JElsey
 * Date:    11/10/2012
 *
 * Even though variables on enums are declared private, they can still be accessed through the enum
 */
public class EnumWithPrivateVar
{
    public static void main(String[] args)
    {
        System.out.println("" + TheEnum.NORTH.initial);

        for(TheEnum e : TheEnum.values()){
            System.out.print("The enum is " + e.name());
            System.out.print(" initial is " + e.initial);
            System.out.println();
        }
    }

    enum TheEnum
    {
        NORTH('N'), WEST('W'), EAST('W'), SOUTH('S');

        private char initial;

        // This has to be default or private, otherwise a compilation error will occur
        TheEnum(char initial)
        {
            this.initial = initial;
        }
    }
}
