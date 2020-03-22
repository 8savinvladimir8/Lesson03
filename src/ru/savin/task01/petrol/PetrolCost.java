package ru.savin.task01.petrol;

import java.io.*;

/**
 * Класс считает стоимость топлива, исходя из количества залитых литров и цены за 1 литр
 */
public class PetrolCost {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите необходимое количество литров:");
        int litersCount = Integer.parseInt(reader.readLine());
        System.out.println("Введите цену за 1 литр:");
        double literPrice = Double.parseDouble(reader.readLine());

        System.out.println("Стоимость бензина: " + litersCount * literPrice + " руб.");
    }
}
