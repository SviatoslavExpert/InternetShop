package mate.academy.internetshop;

import mate.academy.internetshop.dao.ItemDao;
import mate.academy.internetshop.dao.impl.ItemDaoImpl;
import mate.academy.internetshop.service.BucketService;
import mate.academy.internetshop.service.ItemService;
import mate.academy.internetshop.service.impl.BucketServiceImpl;
import mate.academy.internetshop.service.impl.ItemServiceImpl;

public class Factory {
    // For all Dao and Service

    public static ItemService getItemService() {
        return new ItemServiceImpl();
    }

    public static BucketService getBucketService() {
        return new BucketServiceImpl();
    }

    public static ItemDao getItemDao() {
        return new ItemDaoImpl();
    }
}
