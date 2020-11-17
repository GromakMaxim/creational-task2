package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    // Храним ссылку на единственный объект класса
    private static Logger instance = null;
    protected int num = 1;

    //приватный конструктор
    private Logger(int num) {
        this.num = num;
    }

    public void log(String msg) {
        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("[" + dateFormat.format(dateNow) + " " + num++ + "] " + msg);
    }

    // Скрыли конструктор
    public static Logger getInstance(){
        if (instance == null) instance = new Logger(1);
        return instance;
    }
}