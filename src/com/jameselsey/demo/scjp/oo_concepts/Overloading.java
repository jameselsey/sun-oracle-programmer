package com.jameselsey.demo.scjp.oo_concepts;

/**
 * Author:  JElsey
 * Date:    17/08/2012
 *
 * A simple demonstration of what Overloading is and how it can be used. Overloading allows you to have a method with the same
 * name, but overloaded with differing arguments, this is applicable to methods and constructors
 */
public class Overloading
{
    public static void main(String[] args)
    {
        Overloading ol = new Overloading();

        // Same method name, but overloading with differing input arguments
        ol.sayAboutAPerson();
        ol.sayAboutAPerson("James");
        ol.sayAboutAPerson("James", 26);

        // now lets instantiate an object using overloaded constructors
        Person p1 = new Person();
        Person p2 = new Person("James");
        Person p3 = new Person("James", 26);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public void sayAboutAPerson()
    {
        System.out.println("We don't know anything about this person");
    }

    public void sayAboutAPerson(String name)
    {
        System.out.println("Persons name is " + name);
    }

    public void sayAboutAPerson(String name, int age)
    {
        System.out.println("Persons name is " + name + " and age is " + age);
    }
}

class Person
{
    String name;
    int age;

    // Look! We can overload constructors too, particulary helpful if you want the flexibility to
    // instantiate objects using a variety of arguments
    public Person()
    {

    }

    public Person(String name)
    {
        this.name = name;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
