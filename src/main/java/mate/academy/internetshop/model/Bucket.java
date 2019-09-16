package mate.academy.internetshop.model;

import mate.academy.internetshop.BucketIdGenerator;

import java.util.List;

public class Bucket {
    private Long id;       //  make it final!!!
    private Long userId;   //  make it final!!!
    private List<Item> items;

    public Bucket() {
        this.id = BucketIdGenerator.getGeneratedId();
    }

    public Bucket(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getUserId() {
        return userId;
    }
}
