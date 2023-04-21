package org.example;

import java.util.Arrays;

/** Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
 * новый массив, каждый элемент которого равен частному элементов двух входящих массивов
 * в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть -
 * RuntimeException, т.е. ваше.*/
public class Taskhome1_2 {
    public static void main(String[] args) {
        Taskhome1_2 task3 = new Taskhome1_2();
        int[] array1 = new int[] {5, 4, 3};
        int[] array2 = new int[] {1, 1};
        int[] array3 = task3.getDivArray(array1, array2);
        System.out.println(Arrays.toString(array3));
    }
    public int[] getDivArray(int[] arr1, int[] arr2) {
        int[] divArr = new int[arr1.length];
        int i, j, k;
        i = j = k = 0;
        try {
            while (i < arr1.length) {
                divArr[k] = arr1[i] / arr2[j];
                i++;
                j++;
                k++;
            }
        } catch (RuntimeException e) {
            System.out.println("Внимание: деление на ноль или размеры массивов не совпадают!");
            System.exit(0);
        }
        return divArr;
    }
}
