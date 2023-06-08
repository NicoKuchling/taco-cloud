package de.nicokuchling.tacocloud.tacos.data;

import de.nicokuchling.tacocloud.tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
