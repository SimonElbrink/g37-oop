package se.lexicon;

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
        //Instantiating Object
        Person nameOfPerson = new Person("Simon", "Elbrink", 1997);
       // Person nameOfPerson = new Person();

        //FirstName not set yet.
        System.out.println(nameOfPerson.getFirstName());

        //Can't firstName is private - con only be accessed in Person Class.
        //nameOfPerson.firstName = "Simon";

        //Using the Methods
        nameOfPerson.setFirstName("Simon");
        nameOfPerson.setLastName("Elbrink");
        nameOfPerson.setBirthYear(1997);


        System.out.println(nameOfPerson.getFirstName() + " " + nameOfPerson.getLastName() + " The age is: " + nameOfPerson.getAge(2021));


        // Person otherPerson = new Person();
        Person otherPerson = new Person("Erik", "Svensson");

    }


}
