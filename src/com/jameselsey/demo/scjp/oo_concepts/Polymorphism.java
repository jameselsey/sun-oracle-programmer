package com.jameselsey.demo.scjp.oo_concepts;

/**
 * Author:  JElsey
 * Date:    16/08/2012
 *
 * A few examples of polymorphism, meaning that one thing can represent many, or in another words, "morphed" in many (poly) ways
 */
public class Polymorphism
{
    public static void main(String[] args)
    {
        Animal animal;

        //  Polymorphic assignments here, animal being assigned as one of its sub-classes
        animal = new Cat();
        System.out.println("Cat makes a noise : " + animal.makeANoise());
        animal = new Dog();
        System.out.println("Dog makes a noise : " + animal.makeANoise());
        animal = new Fish();
        System.out.println("Fish makes a noise : " + animal.makeANoise());

        // Polymorphic array, declared as type Animal but contains sub-types
        Animal[] theAnimals = new Animal[]{new Cat(), new Dog(), new Fish()};
        for (Animal a : theAnimals)
        {
            // Since they're all of type animal, they all have a makeANoise() method, but the actual
            // implementation varies
            System.out.println(a.makeANoise());
        }
    }
}

abstract class Animal
{
     public abstract String makeANoise();
}

class Cat extends Animal
{
    @Override
    public String makeANoise()
    {
        return "Meow";
    }
}

class Dog extends Animal
{
    @Override
    public String makeANoise()
    {
        return "Woof";
    }
}

class Fish extends Animal
{
    @Override
    public String makeANoise()
    {
        return "Gurgle";
    }
}
