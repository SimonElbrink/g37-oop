package se.lexicon.interfaces;


public class InterfaceExamples {
    public static void main(String[] args) {

        System.out.print("Swim.printMessage() = ");
        Swim.printMessage();

        System.out.println("Swim.MESSAGE_SWIMMING = " + Swim.MESSAGE_SWIMMING);


        Flamingo flamingo = new Flamingo();

        flamingo.message();


    }
}
