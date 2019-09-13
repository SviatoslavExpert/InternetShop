package mate.academy.internetshop;

import mate.academy.internetshop.model.Bucket;
import mate.academy.internetshop.model.Item;
import mate.academy.internetshop.service.BucketService;
import mate.academy.internetshop.service.impl.BucketServiceImpl;

public class Main {
    public static void main(String[] args) {
        BucketService bucketService = new BucketServiceImpl();
        Item item = new Item();
        item.setName("iPhone 11");

        Bucket bucket = new Bucket();
        bucketService.addItem(bucket.getId(), item.getId());

        //  Bucket має стати order
    }
}
