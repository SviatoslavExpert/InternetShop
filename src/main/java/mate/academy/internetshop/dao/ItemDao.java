package mate.academy.internetshop.dao;

import mate.academy.internetshop.model.Item;

public interface ItemDao {
    // CRUD

    Item create(Item item);

    Item get(Long id);

    Item update(Item item);

    void delete(Long id);

    void delete(Item item);

}
