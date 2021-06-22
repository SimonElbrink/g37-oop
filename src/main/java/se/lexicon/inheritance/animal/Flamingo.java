package se.lexicon.inheritance.animal;

import se.lexicon.inheritance.Fly;
import se.lexicon.inheritance.Run;
import se.lexicon.inheritance.Swim;

public class Flamingo implements Run, Fly, Swim {
    @Override
    public int getFlySpeed() {
        return 55;
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public void message() {
        Run.super.message();
        Fly.super.message();
    }

    @Override
    public int getSwimSpeed() {
        return 30;
    }
}
