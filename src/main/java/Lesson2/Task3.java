package Lesson2;

import Lesson3.OOPCalculator;

import java.util.Scanner;
/**
 * 3. Программа должна выполнять одно из заданий на выбор.
 * Если в консоли ввести 1 - запустится выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */
public class Task3 {
    public static void chooseTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задание №2.3\n" +
                "Введите номер задания:\n" +
                "Калькулятор - 1,\n" +
                "Массив слов - 2,\n" +
                "Массив чисел - 3,\n" +
                "Новогодний подарок - 4");

        int task = input.nextInt();
        if (task == 1) {
            OOPCalculator.calculating();
        } else if (task == 2) {
            Task2.getStringArray();
        } else if (task == 3) {
            Task4.stringArray();
        } else if (task == 4) {
            Task5.HollidayGift();
        } else {
            System.err.println("Введите корректный номер задания");
            chooseTask();
        }
        input.close();
    }
    public static void main(String[] args) {
        chooseTask();
    }
}