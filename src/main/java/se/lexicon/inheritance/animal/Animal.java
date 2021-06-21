package se.lexicon.inheritance.animal;

//Extends Object is not actually needed.
public class Animal extends Object {

    public int publicNumber = 20;
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        super(); // Optional
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
