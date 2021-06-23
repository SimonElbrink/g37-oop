package se.lexicon.interfaces;

public interface Swim {

     // public static final
     String MESSAGE_SWIMMING = "Continue Swimming";

     // public abstract
     int getSwimSpeed();

     static void printMessage(){

          System.out.println(MESSAGE_SWIMMING);
     }




}
