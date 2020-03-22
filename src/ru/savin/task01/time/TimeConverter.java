package ru.savin.task01.time;

import java.io.*;

/**
 * Класс конвертирует секунды в часы
 */
public class TimeConverter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество секунд:");
        int secondsCount = Integer.parseInt(reader.readLine());

        if (secondsCount <= 0) {
            System.out.println("Введено некорректное значение!");
        } else {
            System.out.println("Количество часов: " + secondsCount / 3600);
        }

    }
}
