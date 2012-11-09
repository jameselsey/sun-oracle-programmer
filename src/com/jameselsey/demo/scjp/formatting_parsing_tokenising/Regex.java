package com.jameselsey.demo.scjp.formatting_parsing_tokenising;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is a demonstration of some of the basic regex functionality that I needed
 * to study for the SCJP
 *
 * Author:  JElsey
 * Date:    03/11/2012
 */
public class Regex
{
    public static void main(String[] args)
    {
        greedy();
        reluctant();
    }

    /**
     * This is a greedy quantifier, meaning it gobbles up the whole
     * input string before attempting to find a match, in this case, if finds
     * foo on the end so the output is :
     *
     * 0 xfooxxxxxxfoo
     */
    private static void greedy()
    {
        Pattern p = Pattern.compile(".*foo");
        Matcher m = p.matcher("xfooxxxxxxfoo");
        boolean b = false;
        while (b = m.find()){
            System.out.println(m.start() + " " + m.group());
        }
    }

    /**
     * This uses the explicit reluctant quantifier, so it reluctantly goes through
     * the input string from left to right until it matches the pattern, in our case;
     * since it finds foo early on and consumes it, it continues to find another foo
     * later on, so the output is :
     *
     * 0 xfoo
     * 4 xxxxxxfoo
     */
    private static void reluctant()
    {
        Pattern p = Pattern.compile(".*?foo");
        Matcher m = p.matcher("xfooxxxxxxfoo");
        boolean b = false;
        while (b = m.find()){
            System.out.println(m.start() + " " + m.group());
        }
    }
}
