package com.jameselsey.demo.scjp.declarations_initialisation_scoping;

/**
 * Author:  JElsey
 * Date:    21/08/2012
 *
 * A demonstration of different levels of member access
 */
public class MemberAccessModifiers
{
    public static void main(String[] args)
    {
        PubliclyAvailableMembers pam = new PubliclyAvailableMembers();
        PrivateMembers pm = new PrivateMembers();
        DefaultAccess da = new DefaultAccess();

        pam.doSomething();
        // we can access the String here too
        System.out.println(pam.someString);
        pm.doSomething();
        da.doSomething();
    }
}

/*
    This is a public class, it has 2 members (method and a variable). Since both are public, any class can
    "new up" this class and access those public members.
 */
class PubliclyAvailableMembers
{
    public String someString = "blah";

    public void doSomething()
    {
        System.out.println("This is publicly accessible to any class");
    }
}

/*
    This class has 2 private members, which means that only this class can access them. Notice that I've got a public
    method that is externally available, but then calls down into the private methods (this kind of technique is used
    in the singleton pattern).
 */
class PrivateMembers
{
    private String someString = "blah";

    private String privateStringHere()
    {
        return "This is a String";
    }

    public void doSomething()
    {
        System.out.println(privateStringHere());
    }
}

/*
    This class has the default access modifier (the invisible one), so anything in the same package, or subclasses
    can access these members
 */
class DefaultAccess
{
    String someString = "blah";

    void doSomething()
    {
        System.out.println("This is default-accessible method");
    }
}
