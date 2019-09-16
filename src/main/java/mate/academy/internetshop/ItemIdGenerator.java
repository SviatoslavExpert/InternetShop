package mate.academy.internetshop;

public class ItemIdGenerator {
    private static Long idGenerator = 0L;

    private ItemIdGenerator() {

    }

    public static Long getGeneratedId() {
        return idGenerator++;
    }
}
