package Lesson2;

import java.util.Scanner;
/**
 * Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * Использовать комментарии и JavaDoc при описании метода.
 * Использовать форматирование при выводе результата в консоль.
 * Полученный результат округлять до 4-х знаков после запятой.
 */
public class Task1 {
    public static Scanner sc = new Scanner(System.in);

    public static void calculator() {

        double number1 = getDouble(); // вызов метода getDouble()
        double number2 = getDouble(); // вызов метода getDouble()
        char operation = getOperation();
        double result = calc(number1, number2,
                operation);
        System.out.println("Результат операции: ");
        System.out.printf("%.4f", result); // Вывод результата в формате 4 знака после запятой
    }

    public static double getDouble() { //Считывание числа с консоли
        System.out.println("Введите дробное число через запятую, нажмите Enter:");
        double number;
        if (sc.hasNextDouble()) {
            number = sc.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            sc.next();//рекурсия
            number = getDouble();
        }
        return number;
    }

    public static char getOperation() { // выбор операции
        System.out.println("Введите операцию (+, -, *, /):");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            sc.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double number1, double
            number2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Выбрана операция не из списка. Повторите ввод.");
                result = calc(number1, number2,
                        getOperation());//рекурсия
        }
        return result;
    }
}