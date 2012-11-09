package com.jameselsey.demo.scjp.oo_concepts;

/**
 * Author:  JElsey
 * Date:    16/08/2012
 *
 * Sample of inheritance, showing a few classes that extend from each other, there is a little bit of polymorphism in here
 * too, can you spot it?
 */
public class Inheritance
{
    public static void main(String[] args)
    {
        Grandfather grandfather = new Grandfather();
        Daddy daddy = new Daddy();
        Son son = new Son();

        // The Grandfather is at the top of the inheritance tree (extends from java.lang.Object), so he only has wisdomLevel
        System.out.println("The grandfather has a wisdom level of " + grandfather.wisdomLevel);

        // The Daddy is strong, and also inherits his wisdom
        System.out.println("The daddy is " + daddy.strengthLevel + " and also gets the grandfathers wisdom: " + daddy.wisdomLevel);

        // The boy is lucky, hes very energetic, but also inherits strength from his dad, and wisdom from his grandfather
        System.out.println("The son is " + son.energyLevel + " and " + son.strengthLevel + " and " + son.wisdomLevel);

        // Inheritance also works on methods too, since they're all part of the same family, we can safely put the
        // family name in the grandfather, both the son and daddy will inherit that method
        System.out.println("Grandfathers surname : " + grandfather.getFamilyName());
        System.out.println("Daddys surname : " + daddy.getFamilyName());
        System.out.println("Sons surname : " + son.getFamilyName());
    }
}

class Grandfather
{
    String wisdomLevel = "Wise";

    public String getFamilyName()
    {
        return "Jones";
    }
}

class Daddy extends Grandfather
{
    String strengthLevel = "Strong";
}

class Son extends Daddy
{
    String energyLevel = "Energetic";
}
