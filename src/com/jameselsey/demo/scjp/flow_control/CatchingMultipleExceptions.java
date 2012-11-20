package com.jameselsey.demo.scjp.flow_control;

import java.io.IOException;

/**
 * Author:  JElsey
 * Date:    17/08/2012
 *
 * Demonstrating that the finally block is always run, and also how different catches take priority depending
 * where they sit in the class hierarchy.
 */
public class CatchingMultipleExceptions
{
    public static void main(String[] args)
    {
        try
        {
            doSomethingRisky();
        }
        catch (MyFileException e)
        {
            System.out.println("Caught a MyFileException");
        }
        finally
        {
            System.out.println("This will always run, regardless of whether an exception was raised or not");
        }


        try
        {
            doSomethingRisky();
        }
        catch (Exception ex)
        {
            // the call to doSomethingRisky() throws a MyFileException, which inherits from IOException, which als
            // inherits from Exception, therefore MyFileException IS-A Exception, so we'd drop into here, and not ever enter
            // any other catch methods. We'd do the business here, then go into finally.
            System.out.println("Caught me an Exception!");
        }
        /*
        this wont compile if uncommented...why? It's for the same reason as the comment above, the exception would have already
        been caught since it passed the IS-A test.

        catch (MyFileException e)
        {
            e.printStackTrace();
        }
        */


        /*
        This is more likely what you want to do, catch the finest exception first, then if that doesn't find anything,
        start working your way up the hierarchy tree
         */
        try
        {
            doSomethingRisky();
        }
        catch (MyFileException e)
        {
            System.out.println("Caught a MyFileException");
        }
        catch (IOException ioe)
        {
            System.out.println("Caught an IOException");
        }
        catch (Exception ex)
        {
            System.out.println("Caught an Exception");
        }
    }

    private static void doSomethingRisky() throws MyFileException
    {
        throw new MyFileException();
    }

    static class MyFileException extends IOException {}
}


