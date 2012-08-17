package com.jameselsey.demo.scjp.flow_control;

/**
 * Author:  JElsey
 * Date:    07/08/2012
 *
 * Toying around with the Switch statement a little, running on Java 1.6 so not using switch on Strings yet.
 */
public class SwitchStatement
{
    enum Animals
    {
        CAT, DOG, FISH
    }

    public static void main(String... args)
    {
        switchOnInt(5);
        switchOnInt(0);
        switchOnInt(2);
        switchOnInt(3);

        switchOnChar('a');
        switchOnChar('b');
        switchOnChar('c');
        switchOnChar('d');
        switchOnChar('A');
        switchOnChar('g');

        switchOnEnum(Animals.CAT);
        switchOnEnum(Animals.DOG);
        switchOnEnum(Animals.FISH);
    }

    /**
     * This method switches on an int, notice the (1+2) which is evaluated to 3. Also note no appearance
     * of the break statement in the 3rd block, so default will be execute in addition to 3
     *
     * @param theInt int
     */
    public static void switchOnInt(int theInt)
    {
        System.out.println("\n\nAssessing int :" + theInt);
        switch (theInt)
        {
            case 1:
            {
                System.out.println("The int was 1");
                break;
            }
            case 2:
            {
                System.out.println("The int was 2");
                break;
            }
            case (1 + 2):
            {
                System.out.println("The int was 3, and we're not going to break here either");
                //break;
            }
            default:
            {
                System.out.println("This is the default");
            }
        }
    }

    public static void switchOnChar(char theChar)
    {
        System.out.println("\n\nAssessing char : " + theChar);
        switch (theChar)
        {
            case 'a':
            {
                System.out.println("The char was a");
                break;
            }
            case 'b':
            {
                System.out.println("The char was b");
                break;
            }
            case ('c' | 'd'):
            {
                System.out.println("The char bitwised to make g");
                break;
            }
            default:
            {
                System.out.println("The char didn't match anything, must be something else");
            }
        }
    }

    public static void switchOnEnum(Animals theAnimal)
    {
        System.out.println("\n\nAssessing Animal :" + theAnimal);
        switch (theAnimal)
        {
            case CAT:
            {
                System.out.println("The Animal was CAT");
                break;
            }
            case DOG:
            {
                System.out.println("The Animal was DOG");
                break;
            }
            default:
            {
                System.out.println("The animal was something other than CAT or DOG");
            }
        }
    }
}
