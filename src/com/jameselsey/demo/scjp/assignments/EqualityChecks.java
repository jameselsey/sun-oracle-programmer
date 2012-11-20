package com.jameselsey.demo.scjp.assignments;

/**
 * Author:  JElsey
 * Date:    18/11/2012
 *
 * It is important to remember how .equals works, particulary with wrapper classes. The wrapper classes, such as Integer have
 * overridden the .equals method (inherited from Object) to compare the actual int values.
 *
 * On the other hand, if we use == it only equates to true if both wrappers refer to the same object in memory, if you
 * "new up" two separate Integer classes, then technically the variables refer to different objects.
 */
@SuppressWarnings("ALL")
public class EqualityChecks
{
    public static void main(String[] args)
    {
        // These two will pass the .equals check, since .equals is overridden on the Integer wrapper
        // and compares the int values
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        if(i1.equals(i2)){
            System.out.println("They're equal");
        }


        // Since we're not using "new" on wrappers, and just using primitives, we can use ==
        Integer i3 = 1;
        Integer i4 = 1;
        if(i3 == i4){
            System.out.println("They're equal");
        }


        // This won't be true, since we're creating two wrappers, and the == checks if they refer to the same object, and
        // since we created 2 objects via "new", they are not refering to the same object.
        Integer i5 = new Integer(1);
        Integer i6 = new Integer(1);
        if(i5 == i6){
            System.out.println("They're equal");
        }
    }
}
