package se.lexicon;

import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //Primitives Starts with lowercase;
        int number;


        //Objects always start with uppercase
        //Instantiating Object with arguments
        Person nameOfPerson = new Person("Simon", "Elbrink", 1997);

//        //With an edited constructor you don't need to set the values after instantiating.
//        Person nameOfPerson = new Person();
//
//        //Can't firstName is private - con only be accessed in Person Class.
//        nameOfPerson.firstName = "Simon";
//
//        //FirstName not set yet.
//        System.out.println(nameOfPerson.getFirstName());
//
//        nameOfPerson.setFirstName("Simon");
//        nameOfPerson.setLastName("Elbrink");
//        nameOfPerson.setBirthYear(1997);

        System.out.println(nameOfPerson.getFirstName() + " " + nameOfPerson.getLastName() + " Person age is: " + nameOfPerson.getAge(2021));

        Person otherPerson = new Person("Erik", "Svensson");


    }

}
