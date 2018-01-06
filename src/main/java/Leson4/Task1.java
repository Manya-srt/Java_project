import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

package Leson4;

/**
 * Есть входной файл с набором слов, написанных через пробел 
 * Необходимо:
 * Прочитать слова из файла. 
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.       
 * Вывести статистику на консоль 
 * Найти слово с максимальным количеством повторений. 
 * Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class Task1 {
        public static void main(String[] args) {
        Scanner scanner = null;

        // Считываем слова из файла
        try {
            scanner = new Scanner(new File("J:\\Java_project/src/main/java/Leson4/slova.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Производится подсчет слов
        Map<String, Integer> numberOfWords = new TreeMap<>();

        // Сохранение повторяющихся слов
        List<String> maxWords = new ArrayList<>();
        Integer maxNumber = 0;

        // Флаг на случай пустого файла
        Boolean fileIsEmpty = true;

        while (scanner.hasNext()) {
            String currentWord = scanner.useDelimiter("\\s+").next();
            fileIsEmpty = false;
            // Количество слов
            Integer countWord = numberOfWords.get(currentWord);
            if (countWord == null) {
                countWord = 0;
            }
            numberOfWords.put(currentWord, ++countWord);

            // Частое слово
            if (maxNumber < countWord) {
                maxNumber = countWord;
                maxWords.clear();
                maxWords.add(currentWord);
            } else if (maxNumber.equals(countWord)) {
                maxWords.add(currentWord);
            }
        }

        if (!fileIsEmpty) {
            System.out.println("Слова и их количество:");
            System.out.println(numberOfWords);
            System.out.printf("Слово с максимальным количеством повторений/а: %s.\n", maxWords);
            System.out.printf("Повторяется %d раз/а.\n", maxNumber);
        } else {
            System.out.println("Ошибка! Ваш файл, пуст!");
        }

        scanner.close();
    }
}
