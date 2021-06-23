package se.lexicon.enums;

public class Ingredient {

    String ingredientName;
    Measurement measurement;
    double amount;

    public Ingredient(String ingredientName, Measurement measurement, double amount) {
        this.ingredientName = ingredientName;
        this.measurement = measurement;
        this.amount = amount;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", measurement=" + measurement +
                ", amount=" + amount +
                '}';
    }
}
