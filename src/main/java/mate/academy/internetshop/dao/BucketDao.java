package mate.academy.internetshop.dao;

import mate.academy.internetshop.model.Bucket;

public interface BucketDao {
    // ToDo: CRUD operations
    Bucket create(Bucket bucket);

    Bucket get(Long bucketId);

    Bucket update(Bucket bucket);

    Bucket delete(Long id);

    Bucket delete(Bucket bucket);
}
