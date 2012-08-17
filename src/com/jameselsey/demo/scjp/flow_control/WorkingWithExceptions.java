package com.jameselsey.demo.scjp.flow_control;

/**
 * Author:  JElsey
 * Date:    17/08/2012
 *
 * Throwing and catching an exception, either with a try/catch, or declaring a throws clause on the method signature.
 */
public class WorkingWithExceptions
{
    public static void main(String[] args) throws Exception
    {
        // The method that we're dealing with, declares that it can thrown an exception, therefore we need to try/catch
        // around it to make sure we deal with the exception being thrown
        try
        {
            doSomethingThatThrowsAnException();
        }
        catch (Exception e)
        {
            System.out.println("The exception got thrown, lets print it out for now");
            e.printStackTrace();
        }

        // this time we don't explicitly catch and handle the exception, but notice that the main method
        // now declares that it can thrown an exception, so it will just trickle up the call stack until
        // a big horrible scary stack trace displays in the console.
        doSomethingThatThrowsAnException();

    }

    private static void doSomethingThatThrowsAnException() throws Exception
    {
        // Typically, in here we'd do something risky like reading from a file or other I/O source, something that
        // could possibly end bad, such as the file being missing or corrupt or inaccessible, but for now, we'll just hard code
        // it to throw an exception
        throw new Exception();
    }
}
