package Lesson3;

import java.util.Scanner;
public interface Operations {
    /**
     * Считывание символа из консони
     * (инфиксного оператора)
     *
     * @param num1 первый операнд
     * @param num2 второй операнд
     */
    static Double inputOperation(Double num1, Double num2) {
        Double resultOper = null;
        Scanner scanOperation = new Scanner(System.in);
        System.out.println("Введите операцию (+, -, *, /) и нажмите 'ENTER'");
        String mathOper = scanOperation.nextLine();

        if (mathOper.equals("/")) {
            //Проверка деления на ноль
            if ((num2 == 0)) {
                System.err.println("\n" + "Ошибка! Деление на ноль!");
                scanOperation.close();
                resultOper = 0.0000;
            } else {
                resultOper = (num1 / num2);
            }
        } else if (mathOper.equals("*")) {
            resultOper = (num1 * num2);
        } else if (mathOper.equals("+")) {
            resultOper = (num1 + num2);
        } else if (mathOper.equals("-")) {
            resultOper = (num1 - num2);
        } else inputOperation(num1, num2);
        scanOperation.close();
        return resultOper;
    }
}