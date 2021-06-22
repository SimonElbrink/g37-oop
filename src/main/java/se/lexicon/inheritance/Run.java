package se.lexicon.inheritance;

public interface Run {

    int getRunSpeed();

    default void message(){
        System.out.println("Running");
    }

}
