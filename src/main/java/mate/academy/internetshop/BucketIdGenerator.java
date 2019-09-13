package mate.academy.internetshop;

public class BucketIdGenerator {
    private static Long idGenerator = 0L;

    private BucketIdGenerator() {

    }

    public static Long getGeneratedId() {
        return idGenerator++;
    }
}
