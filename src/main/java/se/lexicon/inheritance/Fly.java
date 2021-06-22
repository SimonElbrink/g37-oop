package se.lexicon.inheritance;

public interface Fly {

    int getFlySpeed();

    default void message(){
        System.out.println("Flying");
    }





}
