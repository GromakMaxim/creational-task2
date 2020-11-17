package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int numberOfPassedItems = 0;
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (int item : source) {
            if (item >= treshold) {
                logger.log("Элемент " + item + "проходит");
                result.add(item);
                numberOfPassedItems++;
            } else {
                logger.log("Элемент " + item + "не проходит");
            }
        }
        logger.log("Прошло фильтр " + numberOfPassedItems + "элемента из " + source.size());
        return result;
    }
}
