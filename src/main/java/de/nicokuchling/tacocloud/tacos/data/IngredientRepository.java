package de.nicokuchling.tacocloud.tacos.data;

import de.nicokuchling.tacocloud.tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
