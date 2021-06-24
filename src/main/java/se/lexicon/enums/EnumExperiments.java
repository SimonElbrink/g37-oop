package se.lexicon.enums;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class EnumExperiments {

    public static void main(String[] args) {

        System.out.println("Measurement.GRAM = " + Measurement.GRAM);
        Measurement.valueOf("GRAM");
        //System.out.println(Measurement.valueOf("GALLON"));

        //Measurement.GALLON;

        Ingredient tomato = new Ingredient("Tomato", Measurement.GRAM, 100);
        Ingredient potato = new Ingredient("Potato", Measurement.KILOGRAM, 2);

        Recipe soup = new Recipe("SOUP");
        soup.setRecipeDateTime(LocalDate.of(2021, Month.MARCH,18).atTime(10,30));
        soup.setIngredients(new Ingredient[]{tomato, potato});

        DayOfWeek friday = DayOfWeek.FRIDAY;



    }
}
