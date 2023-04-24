package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Taskhome2 {
    public static void main(String[] args) {
        //Задача 1:
        System.out.println(floatValue());
        //Задача 2:
//        task2();
        //Задача 3:
//        try {
//            Integer a = 90;
//            Integer b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (Exception ex) {
//            System.out.println("Что-то пошло не так...");
//        }
        //Задача 4:
//        task4();
    }

    /* Задача 1:
       Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
       Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
    private static float floatValue() {
        while (true)
            try {
                System.out.print("Введите дробное число:");
                Scanner scanner = new Scanner(System.in);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Введено не число. Повторите ввод:");
            }
    }

    /* Задача 2: Если необходимо, исправьте данный код */
    public static void task2() {
        try {
            int[] intArray = new int[]{1,2,3,4,5,6,7,8};
            int d = 0;
            double caughtRes1 = intArray[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение: ArithmeticException\n" + "Полное описание: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: ArrayIndexOutOfBoundsException\n " + "Полное описание: " + e);
        }
    }
    /* Задача 3: Если необходимо, исправьте данный код */
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    /* Задача 4:
       Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
       Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        try {
            if (input.isEmpty()) {
                throw new NullPointerException("Пустые строки вводить нельзя");
            }
            System.out.println("Вы ввели: " + input);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
