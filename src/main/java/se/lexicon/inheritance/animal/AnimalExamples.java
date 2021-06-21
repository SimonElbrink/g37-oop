package se.lexicon.inheritance.animal;

public class AnimalExamples {

    public static void main(String[] args) {

        Animal animal = new Animal("ANIMAL_NAME", 0);

        System.out.println("animal.getName() = " + animal.getName());

//        Mammal mammal = new Mammal("MAMMAL_NAME", 0);
//        mammal.setName("MAMMAL_NAME");
//        System.out.println("mammal.getName() = " + mammal.getName());
//        //mammal.publicNumber = 0;


        Lion lion = new Lion("Simba", 120);
        lion.makeSound();


    }
}
