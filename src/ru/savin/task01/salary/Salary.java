package ru.savin.task01.salary;

import java.io.*;

/**
 * Класс считает зарплату "на руки", т.е. с вычетом 13% НДФЛ
 */
public class Salary {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите зарплату:");
        double salary = Double.parseDouble(reader.readLine());

        System.out.println("Зарплата \"на руки\": " + salary * 0.87 + " руб.");
    }
}
