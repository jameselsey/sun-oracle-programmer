package com.jameselsey.demo.scjp.declarations_initialisation_scoping;

/**
 * Author:  JElsey
 * Date:    20/08/2012
 *
 * A quick example to show how an interface can be created, and more importantly how it is implemented.
 */
public class ImplementingAnInterface
{
    public static void main(String[] args)
    {
        // Notice the polymorphism here once again, how car IS-A driveable
        Driveable d1 = new Car();
        Driveable d2 = new Motorcycle();
        // The implementations provide the drive() method body.
        d1.drive();
        d2.drive();
    }


    /*
    Create an interface, along with its methods. Think of it like a contract, anything that wants to become Driveable MUST
    implement the drive method, otherwise the contract is not fulfilled and the compiler will complain!
    */
    interface Driveable
    {
        public void drive();
    }

    static class Car implements Driveable
    {
        @Override
        public void drive()
        {
            System.out.println("Super charged v8 goes VROOOOM!!");
        }
    }

    static class Motorcycle implements Driveable
    {
        @Override
        public void drive()
        {
            System.out.println("Front rears up, wheelie down the highway!");
        }
    }
}





