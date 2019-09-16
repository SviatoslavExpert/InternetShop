package mate.academy.internetshop.service;

import mate.academy.internetshop.model.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User get(Long id);

    User update(User user);

    void delete(Long id);

    List getOrders(Long id);
}
