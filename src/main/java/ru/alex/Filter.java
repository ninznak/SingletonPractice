package ru.alex;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer item : source) {
            if (item > treshold) {
                logger.log("Элемент " + "\"" + item + "\"" + " проходит и был добавлен в список");
                result.add(item);
            } else {
                logger.log("Элемент " + "\"" + item + "\"" + " не проходит фильтр!");
            }
        }
        logger.log("Результат фильтрации: прощло " + result.size() + " элементов из " + source.size());
        return result;
    }
}
