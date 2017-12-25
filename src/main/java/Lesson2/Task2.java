package Lesson2;

import java.util.Scanner;
/**
 * 2. Поиск максимального элемента в массиве.
 * Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 * После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 */
public class Task2 {

    public static void getStringArray() {
        int m1;
        String m2, str;
        String delimeter;

        System.out.println("Задайте длину массива: ");
        Scanner s1 = new Scanner(System.in);
        m1 = s1.nextInt();

        String[] subStr = new String[m1];
        System.out.println("Создан массив размерностью " + m1);

        System.out.println("Введите через пробел слова в количестве равном заданной длине массива: ");
        Scanner s2 = new Scanner(System.in);
        m2 = s2.nextLine();

        str = m2;
        delimeter = " "; // Разделитель - пробел
        subStr = str.split(delimeter, m1);

        String tempStr;
        int max = 0;
        int bufmax = 0;

        for(int i = 0; i < subStr.length; i++) {
            tempStr = subStr[i];
            if (tempStr.length() > max){
                max = tempStr.length();
                bufmax = i;
            }
        }
        System.out.println("Самое длинное слово в массиве: " + subStr[bufmax]);
    }
}