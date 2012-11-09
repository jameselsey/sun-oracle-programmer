package com.jameselsey.demo.scjp.io;

import java.io.Console;

/**
 * Author:  JElsey
 * Date:    22/10/2012
 *
 * You have to run this from the command line as the IDE doesn't associate a console and gives a NullPointerException
 */
public class ConsoleTester
{
    public static void main(String[] args)
    {
        Console c = System.console();
        String input = c.readLine("Tell me something: ");

	    System.out.println("You said : " + input);
	
    }
}
