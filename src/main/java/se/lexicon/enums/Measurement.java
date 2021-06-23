package se.lexicon.enums;

//Accessed like a static but features of a instance object
public enum Measurement {

    //"Constructor calls"
    MILLIGRAM(0.001), GRAM(1), HECTOGRAM(100), KILOGRAM(1000), TON(1_000_000);

    //Field
    private final double value;

    //Constructor
    Measurement(double value){
        this.value = value;
    }

    //Getter
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "value=" + value +
                '}';
    }
}
