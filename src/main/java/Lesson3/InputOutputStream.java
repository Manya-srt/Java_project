package Lesson3;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface InputOutputStream {
    /**
     * Чтение числа (операнда) из консоли
     *
     * @return num - введеное число
     */
    static Double inputDouble() {
        Double num = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дробное число через запятую, нажмите Enter:");

        try {
            num = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз");
        }
        if (num == null) {
            num = inputDouble();
        }
        return num;
    }

    /**
     * Округление полученного результата до 4-х знаков после запятой.
     *
     * @param resultOper неформатированное число
     * @return форматированное число
     */
    static String outputDouble(double resultOper) {
        String resultShort = new DecimalFormat("#0.0000").format(resultOper);
        System.out.println("Результат операции: " + resultShort);
        return resultShort;
    }
}