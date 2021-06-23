package se.lexicon.interfaces;

public class Person implements Swim, Run {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getRunSpeed() {


        return 30;
    }

    @Override
    public int getSwimSpeed() {
        System.out.println(Swim.MESSAGE_SWIMMING);
        return 5;
    }
}
