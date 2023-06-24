package org.example.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");

        for (int x = 0; x < source.size(); x++) {
            int m = source.get(x);
            if (m < threshold){
                logger.log("Элемент \"" + m + "\" не проходит");
            } else {
                logger.log("Элемент \"" + m + "\" проходит");
                result.add(m);
            }
        }
        return result;
    }
}
