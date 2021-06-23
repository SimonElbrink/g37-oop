package se.lexicon.interfaces;

class Lion extends Felidae {
    public Lion(String name, int weight) {
        super(name, weight);
    }

    public void makeSound() {
        System.out.println(getName() + " ROARS!");
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }

    @Override
    public int getRunSpeed() {
        return 45;
    }
}
