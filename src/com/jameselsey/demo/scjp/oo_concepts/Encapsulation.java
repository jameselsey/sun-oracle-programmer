package com.jameselsey.demo.scjp.oo_concepts;

/**
 * Author:  JElsey
 * Date:     16/08/2012
 *
 * Demonstrating an understanding of the Encapsulation OOP term, which basically means to shield instance behaviour
 * behind publicly accessible accessors, thus giving more control of the internal representation of the values
 * and provides a single point of access.
 */
public class Encapsulation
{
    public static void main(String[] args)
    {
       // Create a class that doesn't use encapsulation

        UnencapsulatedMess mess = new UnencapsulatedMess();
        mess.personName = "James";
        mess.personAge = 26;
        System.out.println(mess);

        // now create a similar class, but one which implements encapsulation, notice the use of the accessor methods
        // rather than direct variable access
        EncapsulatedDream dream = new EncapsulatedDream();
        dream.setPersonName("James");
        dream.setPersonAge(26);
        System.out.println(dream);


        // Now, lets create another mess, but this time we want to have some control over what values the variable takes
        UnencapsulatedMess anotherMess = new UnencapsulatedMess();
        String someNameThatWouldComeFromAnotherClass = "Daniel";
        int anAgeThatWouldComeFromAnotherClass = 12;
        if (anAgeThatWouldComeFromAnotherClass < 16 || anAgeThatWouldComeFromAnotherClass > 60)
        {
            // handle an error
        }
        else
        {
            anotherMess.personAge = anAgeThatWouldComeFromAnotherClass;
            anotherMess.personName = someNameThatWouldComeFromAnotherClass;
        }
        // Woah! A lot of waffle to validate a value before we place it, and whereever you refer to this unecapsulated
        // class, you'd have to do the same thing, and how easy that would be to get wrong or be inconsistent!

        // With the encapsulated class, you could do all your validation in a central place, and be sure it is ALWAYS invoked,
        // This may not be the BEST place to validate, but its just an example of the benefits of encapsulation.
    }
}


class UnencapsulatedMess
{
    public String personName;
    // no access modifier specified, so takes default
    int personAge;

    @Override
    public String toString()
    {
        return "UnencapsulatedMess{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}

class EncapsulatedDream
{
    // make the state private, so only accessible within the class itself.
    private String personName;
    private int personAge;

    // Accessors
    public String getPersonName()
    {
        return personName;
    }

    public void setPersonName(String personName)
    {
        this.personName = personName;
    }

    public int getPersonAge()
    {
        return personAge;
    }

    /**
     * Another useful utlitly method that encapsulation aids with, returning the person
     * age as a user friendly, readable String.
     * @return String the persons age as a String
     */
    public String getPersonAgeAsString()
    {
        return personAge + " years old";
    }

    /**
     * This is an accessor method to set the persons age, this method also performs some validation
     * on the value being set
     * @param personAge int the persons age, in years
     */
    public void setPersonAge(int personAge)
    {
        if (personAge < 16 || personAge > 60)
        {
            // Do something here! Throw an exception or log something
        }
        else
        {
            this.personAge = personAge;
        }
    }

    @Override
    public String toString()
    {
        return "EncapsulatedDream{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
