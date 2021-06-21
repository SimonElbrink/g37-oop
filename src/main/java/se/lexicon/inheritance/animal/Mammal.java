package se.lexicon.inheritance.animal;


// Can't be instantiated directly
public abstract class Mammal extends Animal{

    private int fooVariable;

    public Mammal(String name, int weight) {
        super(name, weight);
    }

//new Behaviors

    // =Abstract  | To be specified later
    public abstract void makeSound();

    public void foo(){

    }

}
