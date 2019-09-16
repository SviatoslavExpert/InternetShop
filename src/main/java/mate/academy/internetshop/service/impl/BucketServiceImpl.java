package mate.academy.internetshop.service.impl;

import mate.academy.internetshop.annotations.Service;
import mate.academy.internetshop.dao.BucketDao;
import mate.academy.internetshop.dao.ItemDao;
import mate.academy.internetshop.annotations.Inject;
import mate.academy.internetshop.model.Bucket;
import mate.academy.internetshop.model.Item;
import mate.academy.internetshop.service.BucketService;

import java.util.List;

@Service
public class BucketServiceImpl implements BucketService {

    @Inject
    private BucketDao bucketDao;

    @Inject
    private ItemDao itemDao;

    @Override
    public Bucket create(Bucket bucket) {
        return bucketDao.create(bucket);
    }

    @Override
    public Bucket get(Long id) {
        return bucketDao.get(id);
    }

    @Override
    public Bucket update(Bucket bucket) {
        return bucketDao.update(bucket);
    }

    @Override
    public void delete(Long id) {
        bucketDao.delete(id);
    }

    @Override
    public void delete(Bucket bucket) {
        bucketDao.delete(bucket);
    }

    @Override
    public void remove(Long id) {
        bucketDao.delete(id);
    }

    @Override
    public Bucket addItem(Long bucketId, Long itemId) {
        Bucket bucket = bucketDao.get(bucketId);
        Item item = itemDao.get(itemId);
        bucket.getItems().add(item);
        return bucketDao.update(bucket);
    }

    @Override
    public Bucket clear(Long bucketId) {
        Bucket bucket = bucketDao.get(bucketId);
        bucket.getItems().clear();;
        return bucket;
    }

    @Override
    public List getAllItems(Long bucketId) {
        Bucket bucket = bucketDao.get(bucketId);
        return bucket.getItems();
    }
}
