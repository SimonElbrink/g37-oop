package se.lexicon.interfaces;

public interface Run {

    int getRunSpeed();

    default void message(){
        System.out.println("Running");
    }

}
