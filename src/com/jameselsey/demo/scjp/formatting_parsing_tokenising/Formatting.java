package com.jameselsey.demo.scjp.formatting_parsing_tokenising;

/**
 * Author:  JElsey
 * Date:    03/11/2012
 */
public class Formatting
{
    public static void main(String[] args)
    {
        String s = "hello";
        char c = 'j';
        Integer myInt = 12345;
        double d = 123.456;

        System.out.format("This is a string output %s \n", s);

        System.out.format("This is a character output %c \n", c);

        System.out.format("This is a number : %d \n", myInt);

        System.out.format("This is a double %f \n", d);
        System.out.format("Lets format the double nicer %.2f", d);
    }
}
