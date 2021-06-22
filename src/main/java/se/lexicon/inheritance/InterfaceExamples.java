package se.lexicon.inheritance;


import se.lexicon.inheritance.animal.Flamingo;

public class InterfaceExamples {
    public static void main(String[] args) {

        System.out.print("Swim.printMessage() = ");
        Swim.printMessage();

        System.out.println("Swim.MESSAGE_SWIMMING = " + Swim.MESSAGE_SWIMMING);


        Flamingo flamingo = new Flamingo();

        flamingo.message();


    }
}
