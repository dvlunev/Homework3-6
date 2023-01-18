package me.lunev.homework36.services;

public interface FilesService {

    boolean saveIngredientToFile(String json);

    boolean saveRecipeToFile(String json);

    String readFromIngredientsFile();

    String readFromRecipesFile();
}
