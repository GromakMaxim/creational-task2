package org.example;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка:");
        int listSize = myScan.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = myScan.nextInt();

        logger.log("Создаём и наполняем список");
        RandomizedArray randomizedArray = new RandomizedArray();
        List<Integer> arrlist = randomizedArray.fillListByRandomValues(listSize, maxValue);
        System.out.println("Вот случайный список: " + arrlist);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int filterValue = myScan.nextInt();
        Filter filter = new Filter(filterValue);
        List<Integer> resultArrList = filter.filterOut(arrlist);
        logger.log("Выводим результат на экран");
        System.out.println(resultArrList);
        logger.log("Завершаем программу");
    }
}
