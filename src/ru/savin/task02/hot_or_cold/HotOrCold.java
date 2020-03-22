package ru.savin.task02.hot_or_cold;

import java.io.*;
import java.util.Random;

/**
 * Класс "загадывает" целое число в диапазоне от 1 до 100, а пользователь его отгадывает
 */
public class HotOrCold {
    private static int secretNumber = 0;
    private static int previousOption = 0;
    private static int currentOption = 0;

    public static void main(String[] args) throws IOException {
        secretNumber = getRandomFromRange(1, 100);
        System.out.println("Угадайте загаданное число из диапазона от 1 до 100. Для выхода введите 0.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            currentOption = Integer.parseInt(reader.readLine());

            if (currentOption == 0) {
                System.out.println("Выходим из игры.");
                break;
            } else if (currentOption < 0 || currentOption > 100) {
                System.out.println("Введено число вне диапазона от 1 до 100. Введите число из диапазона.");
            } else {
                if (currentOption == secretNumber) {
                    System.out.println("Угадали! Игра окончена.");
                    break;
                } else {
                    displayHotterOrColder();
                    previousOption = currentOption;
                }
            }
        }
    }

    public static int getRandomFromRange(int a, int b) {
        Random rand = new Random();
        return a + rand.nextInt(b - a + 1);
    }

    private static void displayHotterOrColder() {
        if (abs(secretNumber - previousOption) < abs(secretNumber - currentOption)) {
            System.out.println("Холодно!");
        } else if (abs(secretNumber - previousOption) > abs(secretNumber - currentOption)) {
            System.out.println("Горячо!");
        } else if (abs(secretNumber - previousOption) == abs(secretNumber - currentOption)) {
            System.out.println("Горячо!");
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
