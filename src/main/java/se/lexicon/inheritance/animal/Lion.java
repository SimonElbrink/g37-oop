package se.lexicon.inheritance.animal;

class Lion extends Felidae {
    public Lion(String name, int weight) {
        super(name, weight);
    }

    public void makeSound(){
        System.out.println(getName() + " ROARS!");
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public int getRunSpeed() {
        return 75;
    }
}