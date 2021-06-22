package se.lexicon.inheritance.animal;

import se.lexicon.inheritance.Run;
import se.lexicon.inheritance.Swim;

/**
 * Fun facts.
 * All cats big and small belong to the family Felidae.
 * But of the 37 species of felids, only 8 of them can roar!
 * The other 29 species of cats are meowers.
 * Cats that meow are classed in the subfamily, Felinae.
 */


public class Felidae extends Mammal implements Swim, Run {

    public Felidae(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound");
    }

    @Override
    public int getSwimSpeed(){
        return 5;
    }

    @Override
    public int getRunSpeed() {
        return 20;
    }
}