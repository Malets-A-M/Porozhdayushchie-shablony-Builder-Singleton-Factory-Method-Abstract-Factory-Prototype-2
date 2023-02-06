import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxValue = 0;
        int sizeList;
        int threshold;
        Logger logger = Logger.getInstance();
        Filter filterList;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        sizeList = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < sizeList; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        threshold = scanner.nextInt();
        filterList = new Filter(threshold);
        filterList.filterOut(list);
        logger.log("Завершаем программу");
    }
}