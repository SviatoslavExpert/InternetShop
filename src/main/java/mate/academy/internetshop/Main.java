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

import java.util.List;

public class Main {
    static {
        try {
            Injector.injectDependencies();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Inject
    private static UserService userService;
    @Inject
    private static OrderService orderService;
    @Inject
    private static ItemService itemService;
    @Inject
    private static BucketService bucketService;

    public static void main(String[] args) {

        User mike = userService.create(new User("Mike"));
        User tom = userService.create(new User("Tom"));

        Bucket bucketMike = new Bucket(mike.getId());
        bucketService.create(bucketMike);

        Bucket bucketTom = new Bucket(mike.getId());
        bucketService.create(bucketTom);

        Item phone = itemService.create(new Item("iPhone", 30000.0));
        Item laptop = itemService.create(new Item("Samsung", 25000.0));
        Item tab = itemService.create(new Item("Lenovo", 10000.0));

        bucketService.addItem(bucketMike.getId(), phone.getId());
        bucketService.addItem(bucketMike.getId(), laptop.getId());
        bucketService.addItem(bucketTom.getId(), tab.getId());

        orderService.completeOrder(bucketMike.getItems(), mike.getId());
        bucketService.clear(bucketMike.getId());

        orderService.completeOrder(bucketTom.getItems(), tom.getId());
        bucketService.clear(bucketTom.getId());

        List<Order> allOrdersForUserMike = orderService.getAllOrdersForUser(mike.getId());
        allOrdersForUserMike.forEach(System.out::println);

        System.out.println();
        List<Order> allOrdersForUserTom = orderService.getAllOrdersForUser(tom.getId());
        allOrdersForUserTom.forEach(System.out::println);
    }
}
