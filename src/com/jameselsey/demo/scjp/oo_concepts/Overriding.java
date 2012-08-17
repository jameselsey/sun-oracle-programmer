package com.jameselsey.demo.scjp.oo_concepts;

/**
 * Author:  JElsey
 * Date:    17/08/2012
 *
 * Another simple example, this time demonstrating how overriding works, whereby a class can override
 * method functionality from a superclass by declaring a method with a matching signature, then swapping out the
 * implementation for something more specific.
 */
public class Overriding
{
    public static void main(String[] args)
    {
        Bird b1 = new Bird();
        Bird b2 = new Eagle();

        // Both are of reference type Bird, but their assigned value is Bird/Eagle
        // The Eagle has an override on saySomething(), so its results are different.
        b1.saySomething();
        b2.saySomething();
    }
}

class Bird
{
    public void saySomething()
    {
        System.out.println("saySomething from Bird class");
    }
}

class Eagle extends Bird
{
    // This is an override of a superclass method, signature is identical
    public void saySomething()
    {
        System.out.println("saySomething from Eagle class");
    }
}

