package mate.academy.internetshop;

import mate.academy.internetshop.dao.BucketDao;
import mate.academy.internetshop.dao.ItemDao;
import mate.academy.internetshop.dao.OrderDao;
import mate.academy.internetshop.dao.UserDao;
import mate.academy.internetshop.dao.impl.BucketDaoImpl;
import mate.academy.internetshop.dao.impl.ItemDaoImpl;
import mate.academy.internetshop.dao.impl.OrderDaoImpl;
import mate.academy.internetshop.dao.impl.UserDaoImpl;
import mate.academy.internetshop.service.BucketService;
import mate.academy.internetshop.service.ItemService;
import mate.academy.internetshop.service.OrderService;
import mate.academy.internetshop.service.UserService;
import mate.academy.internetshop.service.impl.BucketServiceImpl;
import mate.academy.internetshop.service.impl.ItemServiceImpl;
import mate.academy.internetshop.service.impl.OrderServiceImpl;
import mate.academy.internetshop.service.impl.UserServiceImpl;

public class Factory {
    // For all Dao and Service

    public static ItemService getItemService() {
        return new ItemServiceImpl();
    }

    public static BucketService getBucketService() {
        return new BucketServiceImpl();
    }

    public static OrderService getOrderService() {
        return new OrderServiceImpl();
    }

    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    public static ItemDao getItemDao() {
        return new ItemDaoImpl();
    }

    public static BucketDao getBucketDao() {
        return new BucketDaoImpl();
    }

    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
