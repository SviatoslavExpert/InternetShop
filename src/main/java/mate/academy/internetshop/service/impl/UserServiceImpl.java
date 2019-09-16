package mate.academy.internetshop.service.impl;

import mate.academy.internetshop.annotations.Inject;
import mate.academy.internetshop.annotations.Service;
import mate.academy.internetshop.dao.BucketDao;
import mate.academy.internetshop.dao.UserDao;
import mate.academy.internetshop.model.User;
import mate.academy.internetshop.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    private static UserDao userDao;

    @Inject
    private static BucketDao bucketDao;

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public List getOrders(Long userId) {
        return userDao.get(userId).getOrders();
    }
}
