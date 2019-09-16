package mate.academy.internetshop.model;

import mate.academy.internetshop.OrderIdGenerator;

import javax.print.attribute.standard.DateTimeAtProcessing;
import java.util.List;

public class Order {
    private final Long id;
    private final Long userId;
    private final List<Item> items;

    public Order(Long userId, List<Item> items) {
        this.userId = userId;
        this.items = items;
        this.id = OrderIdGenerator.getGeneratedId();
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public List<Item> getItems() {
        return items;
    }
}
