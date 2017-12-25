package Lesson3;

public class OOPCalculator implements InputOutputStream, Operations {
         /**
         * Использование статических методов в интерфейсе,
         * не позволяет классам, которые реализуют интерфейс, переопределить их.
         * Механика: "Ввод двух чисел и выполнение над ними арифметической операции"
         */
        public static void calculating() {
            Double num1 = InputOutputStream.inputDouble();
            Double num2 = InputOutputStream.inputDouble();
            Double oper = Operations.inputOperation(num1, num2);
            InputOutputStream.outputDouble(oper);
        }
      }
