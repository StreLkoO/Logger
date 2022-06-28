import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filter(List<Integer> source) {
        Logger logger = Logger.get();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int i : source) {
            if (i >= threshold) {
                result.add(i);
                logger.log("Элемент \"" + i + "\" подходит");
            }
            else {
                logger.log("Элемент \"" + i + "\" не подходит");
            }
        }
        return result;
    }
}
