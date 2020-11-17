package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedArray {
    private final List<Integer> randomizedArray = new ArrayList<>();

    public List<Integer> fillListByRandomValues(int listSize, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            randomizedArray.add(random.nextInt(maxValue));
        }
        return randomizedArray;
    }


}
