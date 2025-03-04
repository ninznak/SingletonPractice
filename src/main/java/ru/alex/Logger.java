package ru.alex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private int num = 1;
    private static final Logger instance = new Logger();
    LocalDateTime currentTime = java.time.LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg) {
        System.out.println("[" + currentTime.format(formatter) + " " + num++ + "] " + msg);
    }
}