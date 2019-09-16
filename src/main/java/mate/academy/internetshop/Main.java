package mate.academy.internetshop;

import mate.academy.internetshop.annotations.Inject;
import mate.academy.internetshop.annotations.Injector;
import mate.academy.internetshop.model.Bucket;
import mate.academy.internetshop.model.Item;
import mate.academy.internetshop.model.Order;
import mate.academy.internetshop.model.User;
import mate.academy.internetshop.service.BucketService;
import mate.academy.internetshop.service.ItemService;
import mate.academy.internetshop.service.OrderService;
import mate.academy.internetshop.service.UserService;
import mate.academy.internetshop.service.impl.BucketServiceImpl;
import mate.academy.internetshop.service.impl.ItemServiceImpl;
import mate.academy.internetshop.service.impl.OrderServiceImpl;
import mate.academy.internetshop.service.impl.UserServiceImpl;

import java.util.List;

public class Main {

    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Inject
    private static ItemService itemService;
    @Inject
    private static BucketService bucketService;
    @Inject
    private static OrderService orderService;
    @Inject
    private static UserService userService;

    public static void main(String[] args) {
        BucketService bucketService = new BucketServiceImpl();
        ItemService itemService = new ItemServiceImpl();
        UserService userService = new UserServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Item item = new Item();
        item.setName("iPhone 11");
        itemService.create(item);

        User user = new User();
        userService.create(user);

        Bucket bucket = new Bucket(user.getUserId());
        bucketService.create(bucket);
        bucketService.addItem(bucket.getId(), item.getId());

        orderService.completeOrder(user.getUserId(), bucket.getItems());
        bucketService.remove(bucket.getId());

        List<Order> allOrdersForUser = orderService.getAllOrdersForUser(user.getUserId());
        allOrdersForUser.stream().forEach(System.out::println);

    }
}
