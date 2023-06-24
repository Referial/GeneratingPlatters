package org.example.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка: \n" +
                "Введите размер списка:");

        int n = scanner.nextInt();
        logger.log("Введите верхнюю границу для значений:");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        ArrayList<Integer> list = new ArrayList<>();

        for (int x = 0; x < n; x++) {
            int c = random.nextInt(m);
            list.add(c);
        }
        logger.log("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации \n" +
                "Введите порог для фильтра:");

        Filter filter = new Filter(scanner.nextInt());

        logger.log("Выводим результат на экран \n" +
                "Oтфильтрованный список: " + filter.filterOut(list));

        logger.log("Завершаем программу");
    }
}
