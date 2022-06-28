import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.get();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер списка: ");
            int size = scanner.nextInt();
            System.out.print("Введите верхнюю границу для значений: ");
            int maxValue = scanner.nextInt();
            ListCreator lc = ListCreator.get();
            List<Integer> list = lc.createList(size, maxValue);
            System.out.println("Вот случайный список: " + list);
            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.print("Введите порог для фильтра: ");
            int threshold = scanner.nextInt();
            Filter filter = new Filter(threshold);
            List<Integer> result = filter.filter(list);
            logger.log("Выводим результат на экран");
            System.out.println("Отфильтрованный список: " + result);
        } catch (Exception e) {
            logger.log("Произошла ошибка: " + e.getMessage() + " в " + Arrays.toString(e.getStackTrace()));
        }
        logger.log("Завершаем программу");
    }
}
