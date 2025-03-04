package ru.alex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Привет! Программа работает!");
        logger.log("Создаются служебные объекты...");

        int size = 0;
        int upperBound = 0;
        int threshold = 0;
        Filter filter;

        logger.log("Запрос на получение данных от пользователя...");
        logger.log("Получение данных от пользователя...");

        try {
            System.out.println("Введите размер списка: ");
            Scanner sc = new Scanner(System.in);
            size = sc.nextInt();
            System.out.println("Введите верхнюю границу для значений: ");
            upperBound = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введено не число!");
        }

        logger.log("Создаем и наполняем список");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * upperBound));
            logger.log("Добавили в список число " + list.get(i));
        }

        System.out.println("Создан список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");

        try {
            Scanner sc = new Scanner(System.in);
            threshold = sc.nextInt();
            logger.log("Порог для фильтрации = " + threshold);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введено не число!");
        }

        logger.log("Создаем фильтр");
        filter = new Filter(threshold);

        logger.log("Применяем фильтр к списку");
        System.out.println("Получен отфильтрованный список: " + filter.filterOut(list));
        logger.log("Работа программы завершена!");
    }
}