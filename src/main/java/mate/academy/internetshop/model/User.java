package mate.academy.internetshop.model;

import mate.academy.internetshop.UserIdGenerator;

import java.util.List;

import static mate.academy.internetshop.dao.Storage.orders;

public class User {
    private final Long userId;
    private String name;

    public User() {
        this.userId = UserIdGenerator.getGeneratedId();
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
