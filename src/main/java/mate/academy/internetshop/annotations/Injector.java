package mate.academy.internetshop.annotations;

import mate.academy.internetshop.Factory;
import mate.academy.internetshop.Main;
import mate.academy.internetshop.service.impl.BucketServiceImpl;
import mate.academy.internetshop.service.impl.ItemServiceImpl;
import mate.academy.internetshop.service.impl.OrderServiceImpl;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {

        Field[] itemServiceFields = ItemServiceImpl.class.getDeclaredFields();
        Field[] bucketServiceFields = BucketServiceImpl.class.getDeclaredFields();
        Field[] orderServiceFields = OrderServiceImpl.class.getDeclaredFields();

        for (Field field : itemServiceFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, AnnotatedClassMap.getImplementation(field.getType()));
            }
        }
        for (Field field : bucketServiceFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, AnnotatedClassMap.getImplementation(field.getType()));
            }
        }
        for (Field field : orderServiceFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, AnnotatedClassMap.getImplementation(field.getType()));
            }
        }

        Field[] userServiceFields = OrderServiceImpl.class.getDeclaredFields();
        for (Field field : userServiceFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, AnnotatedClassMap.getImplementation(field.getType()));
            }
        }

        Class<Main> mainClass = Main.class;
        Field[] mainFields = mainClass.getDeclaredFields();
        for (Field field : mainFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, AnnotatedClassMap.getImplementation(field.getType()));
            }
        }
    }
}
