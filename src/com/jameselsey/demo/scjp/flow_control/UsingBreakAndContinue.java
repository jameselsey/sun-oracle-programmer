package com.jameselsey.demo.scjp.flow_control;

/**
 * Author:  JElsey
 * Date:    22/08/2012
 *
 * Experimenting with the break and continue keywords, also using labeling.
 */
public class UsingBreakAndContinue
{
    public static void main(String[] args)
    {
        doUnlabeledBreak();
        doUnlabeledContinue();

        doLabeledBreak();
        doLabeledContinue();

        doNestedLabeledBreak();
        doNestedLabeledContinue();
    }



    /*
        Since we're not using any labels here, the break will break out of the inner most loop, then move
        onto the next statement AFTER the loop. Break will "break out" immediately from the iteration, great for
        cases when you're counting up something, find you have done all the iterations you need, then you can break out
        and prevent wasting time on iterations you no longer need.
     */
    private static void doUnlabeledBreak()
    {
        System.out.println("START - Un-labeled break");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("\tIteration on i:" + i);
            System.out.println("\tLets call break, we don't want to do any more");
            break;
            // We're done with the whole loop, "break out" and move onto whatever comes after the loop
            // we don't want to do any more iterations
        }
        System.out.println("END - Un-labeled break");

    }

    /*
        We're using no labeling here, so much like the example above, the continue will take effect on the inner most
        loop. Continue drops out of the current iteration immediately, and attempts the next iteration, if there is one.
        This is great for scenarios where you're checking numbers for odd/even, if its an odd number, you could continue on
        to the next iteration; if you only require doing stuff with even numbers (just an example).
     */
    private static void doUnlabeledContinue()
    {
        System.out.println("START - Un-labeled continue");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("\tIteration on i:" + i);
            System.out.println("\tLets call continue, we don't want to do any more in this iteration");
            continue;
            // anything under here can't be accessed, since you've called continue which drops out
            // of the iteration and "continues" with the next iteration, if there is one
        }
        System.out.println("END - Un-labeled continue");
    }

    /*
        Behaves similar to the unlabeled break, however if you break on a label, it will break for THAT label rather
        than the inner most loop. This is great when you have complex, nested iteration cycles.
     */
    private static void doLabeledBreak()
    {
        System.out.println("START - labeled break");
        labeledBreak:
        for (int i = 0; i < 5; i++)
        {
            System.out.println("\tIteration on i: " + i);
            System.out.println("\tLets call break, we don't want to do any more in this iteration");
            break labeledBreak;
            // We've broken out to the "labeledBreak", so we won't do any more further iterations of this label
        }
        System.out.println("END - labeled break");
    }

    /*
        Similar to the labled break, the labeled continue will move onto the next iteration of the label you've
        specified, if there is an iteration, otherwise the loop is complete.
     */
    private static void doLabeledContinue()
    {
        System.out.println("START - Labeled continue");
        labeledContinue:
        for (int i = 0; i < 5; i++)
        {
            System.out.println("\tIteration on i:" + i);
            System.out.println("\tLets call continue, we don't want to do any more in this iteration");
            continue labeledContinue;
            // anything under here can't be accessed, since you've called continue which drops out
            // of the iteration and "continues" with the next iteration, if there is one
        }
        System.out.println("END - Labeled continue");
    }

    /*
        Using nested breaks here, with labels, so you can see how breaking out of individual nested looping
        constructs would work.
     */
    private static void doNestedLabeledBreak()
    {
        System.out.println("START - Nested Labeled break");
        outerLoop:
        for (int i = 0; i < 5; i++)
        {
            innerLoop:
            for(int inner = 0; inner < 5; inner++)
            {
                System.out.println("We're in the inner loop, lets break out of it...");
                break innerLoop;
            }
            System.out.println("Now lets break out of the outer loop too");
            break outerLoop;
        }
        System.out.println("END - Nested Labeled break");
    }

    /*
        Using nested labeled continues here to demonstrate how you'd continue onto labeled looping constructs.
     */
    private static void doNestedLabeledContinue()
    {
        System.out.println("START - Nested Labeled continue");
        outerLoop:
        for (int i = 0; i < 5; i++)
        {
            innerLoop:
            for(int inner = 0; inner < 5; inner++)
            {
                System.out.println("We're in the inner loop, lets continue out of it...");
                continue innerLoop;
            }
            System.out.println("Now lets continue out of the outer loop too");
            continue outerLoop;
        }
        System.out.println("END - Nested Labeled continue");
    }

    /*
        Not quite sure where I was going with this one, but was experimenting with some continue
        and break combinations.
     */
    private static void countingNumbers()
    {
        outerLoop:
        for(int i = 0; i <100; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Number is odd, lets continue to next iteration");
                continue outerLoop;
            }

            int sumOfEvens = 0;
            for(int j = 0; j < i; j++)
            {
                 sumOfEvens+= j;
            }

            if(i == 50)
            {
                System.out.println("We'll only count halfway, and give up at 50");
                break outerLoop;
            }
        }
    }
}
