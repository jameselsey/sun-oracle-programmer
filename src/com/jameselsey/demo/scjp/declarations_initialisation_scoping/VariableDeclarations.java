package com.jameselsey.demo.scjp.declarations_initialisation_scoping;

/**
 * Author:  JElsey
 * Date:    21/08/2012
 */
public class VariableDeclarations
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c = a;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 5;

        System.out.println("a : " + a);
        System.out.println("c : " + c);


        String cat = new String("cat");
        String dog = new String("dog");
        String sheep = new String(cat);

        System.out.println("cat is : " + cat);
        System.out.println("dog is : " + dog);
        System.out.println("sheep is : " + sheep);
        cat = "owl";
        System.out.println("cat is : " + cat);
        System.out.println("sheep is : " + sheep);
    }
}
