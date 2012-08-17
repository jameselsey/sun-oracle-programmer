package com.jameselsey.demo.scjp.flow_control;

/**
 * Author:  JElsey
 * Date:    17/08/2012
 *
 * A little demonstration as to how you can subclass the Exception to be able to handle extra exception
 * information specific to your application.
 */
public class CreatingYourOwnExceptions
{
    public static void main(String[] args)
    {
        try
        {
            doSomeRiskyStuff();
        }
        catch (MyException e)
        {
            System.out.println("Error code is : " + e.errorCode);
        }
    }

    private static void doSomeRiskyStuff() throws MyException
    {
        throw new MyException("ERROR-1");

    }
}

class MyException extends Exception
{
     String errorCode;

    MyException(String errorCode)
    {
        this.errorCode = errorCode;
    }
}
