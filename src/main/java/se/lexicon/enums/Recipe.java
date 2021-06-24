package se.lexicon.enums;


import java.time.LocalDateTime;

public class Recipe {

    private String name;
    LocalDateTime recipeDateTime;
    private Ingredient[] ingredients;
    private String[] instructions;

    public Recipe(String name, LocalDateTime recipeDateTime, Ingredient[] ingredients, String[] instructions) {
        this.name = name;
        this.recipeDateTime = recipeDateTime;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Recipe(String name) {
        this(name, LocalDateTime.now(),new Ingredient[0],new String[0]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRecipeDateTime() {
        return recipeDateTime;
    }

    public void setRecipeDateTime(LocalDateTime recipeDateTime) {
        this.recipeDateTime = recipeDateTime;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }
}
