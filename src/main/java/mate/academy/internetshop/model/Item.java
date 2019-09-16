package mate.academy.internetshop.model;

import mate.academy.internetshop.ItemIdGenerator;

public class Item {
    private Long id;   // make final
    private String name;
    private Double price;

    public Item() {
        this.id = ItemIdGenerator.getGeneratedId();
    }

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
