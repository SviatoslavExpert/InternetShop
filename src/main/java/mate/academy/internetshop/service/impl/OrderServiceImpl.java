package mate.academy.internetshop.service.impl;

import mate.academy.internetshop.annotations.Inject;
import mate.academy.internetshop.annotations.Service;
import mate.academy.internetshop.dao.OrderDao;
import mate.academy.internetshop.dao.Storage;
import mate.academy.internetshop.dao.UserDao;
import mate.academy.internetshop.model.Item;
import mate.academy.internetshop.model.Order;
import mate.academy.internetshop.service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Inject
    private OrderDao orderDao;

    @Inject
    private UserDao userDao;

    @Override
    public Order create(Order order) {
        return orderDao.create(order);
    }

    @Override
    public Order get(Long id) {
        return orderDao.get(id);
    }

    @Override
    public Order update(Order order) {
        return orderDao.update(order);
    }

    @Override
    public void delete(Long id) {
        orderDao.delete(id);
    }

    @Override
    public void delete(Order order) {
        orderDao.delete(order);
    }

    @Override
    public Order completeOrder(Long userId, List<Item> items) {
        Order order = new Order(userId, items);
        orderDao.add(order);
        userDao.get(userId).getOrders().add(order);
        return order;
    }

/*    @Override
    public Order completeOrder(Bucket bucket) {
        // 1. GEt list of items and userId
        // 2. Delete the bucket if item was "registered" (оформлений) successfully
        return null;
    }*/

    @Override
    public List<Order> getAllOrdersForUser(Long userId) {
        return Storage.orders.stream()
                .filter(o -> o.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}
