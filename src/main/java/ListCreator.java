import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListCreator {
    private static ListCreator instance;

    private ListCreator() {
    }

    public static ListCreator get() {
        if (instance == null) {
            instance = new ListCreator();
        }
        return instance;
    }

    public List<Integer> createList(int size, int maxValue) {
        Logger logger = Logger.get();
        logger.log("Создаём и наполняем список");
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        if (size < 1) {
            throw new IllegalArgumentException("Размер списка должен быть больше 0!");
        }
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(maxValue));
        }
        return result;
    }
}
