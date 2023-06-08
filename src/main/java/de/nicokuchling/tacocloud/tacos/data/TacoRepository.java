package de.nicokuchling.tacocloud.tacos.data;

import de.nicokuchling.tacocloud.tacos.Taco;

public interface TacoRepository {
    Taco save(Taco taco);
}
