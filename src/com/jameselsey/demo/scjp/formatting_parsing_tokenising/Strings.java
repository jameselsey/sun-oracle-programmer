package com.jameselsey.demo.scjp.formatting_parsing_tokenising;

/**
 * Experimenting with Strings, nothing too groundbreaking here...
 *
 * Author:  JElsey
 * Date:    03/11/2012
 */
public class Strings
{
    public static void main(String[] args)
    {
        doStrings();
        doStringBuilder();
    }

    private static void doStringBuilder()
    {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");

        System.out.println(sb);

        System.out.println(sb.reverse());
    }

    private static void doStrings()
    {
        String s = "hello";
        s.concat(" world");
        // String is immutable, so you can't change existing value like attempted above
        System.out.println(s);


        // This would work, since you're reassigning s
        s = s.concat(" world");
        System.out.println(s);

        // This is another way of building a string
        s += " yay!";
        System.out.println(s);
    }
}
