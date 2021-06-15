package se.lexicon;


public class App
{
    public static void main( String[] args ) {
        
        //Static VS NON-Static|Instance

        //Created an instance of Car class. Accessed via "bmw".
        Car bmw = new Car("e30", "BMW", "ABC123");
        System.out.println("bmw.regNumber = " + bmw.regNumber);
        System.out.println("bmw.id = " + bmw.id);



        //Accessing Car.sequencer in an static way.
        System.out.println("Car.sequencer = " + Car.sequencer);


        Car volvo = new Car("XC70", "Volvo", "CBA321");
        System.out.println("volvo.regNumber = " + volvo.regNumber);
        System.out.println("volvo.getRegNumber() = " + volvo.getRegNumber());
        System.out.println("volvo.id = " + volvo.id);

        System.out.println("Car.sequencer = " + Car.sequencer);
        System.out.println("Car.getSequencer() = " + Car.getCurrentIdNumber());

        //Changing Static field sequencer in Car Class to 9000
        Car.sequencer = 9000;

        System.out.println("Car.sequencer = " + Car.sequencer);
        
        Car opel = new Car("Astra", "Opel", "CBA231");
        System.out.println("opel.id = " + opel.id); // 9001



        //Demo
        opel.nonstaticMethod();
        Car.staticMethod();












    }








    private static void lecture1() {
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
