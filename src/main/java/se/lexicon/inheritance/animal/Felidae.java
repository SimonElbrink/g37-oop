package se.lexicon.inheritance.animal;

/**
 * Fun facts.
 * All cats big and small belong to the family Felidae.
 * But of the 37 species of felids, only 8 of them can roar!
 * The other 29 species of cats are meowers.
 * Cats that meow are classed in the subfamily, Felinae.
 */


public class Felidae extends Mammal{

    public Felidae(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound");
    }
}