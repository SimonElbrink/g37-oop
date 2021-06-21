package se.lexicon.inheritance.animal;

class Cat extends Felidae {
    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}