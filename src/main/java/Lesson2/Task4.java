package Lesson2;

/**
 * 4. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 */
public class Task4 {

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static void stringArray() {

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rnd(-10, 10);
            System.out.print(numbers[i] + " ");
        }
        int maxInd = 0;
        int max = -11;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max && numbers[i] < 0) {
                max = numbers[i];
                maxInd = i;
            }
        }
        int minInd = 0;
        int min = 11;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < min && numbers[j] > 0) {
                min = numbers[j];
                minInd = j;
            }
        }
        //Меняем местами элементы массива
        numbers[maxInd] = min;
        numbers[minInd] = max;

        System.out.println("\nМаксимальный отрицательный элемент массива = " + max);
        System.out.println("Индекс элемента = " + maxInd + "\n");

        System.out.println("Минимальный положительный элемент массива = " + min);
        System.out.println("Индекс элемента = " + minInd + "\n");

        System.out.println("Меняем местами элементы массива");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}