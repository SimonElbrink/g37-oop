package se.lexicon.interfaces;

public interface Fly {

    int getFlySpeed();

    default void message(){
        System.out.println("Flying");
    }





}
