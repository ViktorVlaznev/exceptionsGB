package org.example;

import java.util.Arrays;

/** Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих
 * массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
public class Taskhome1_1 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Taskhome1_1 task2 = new Taskhome1_1();
        int[] array1 = new int[] {5, 4, 7};
        int[] array2 = new int[] {2, 1};
        int[] array3 = task2.getDifArray(array1, array2);
        System.out.println(Arrays.toString(array3));
    }
    public int[] getDifArray(int[] arr1, int[] arr2) throws ArrayIndexOutOfBoundsException {
        if (arr1.length != arr2.length) {
            throw new ArrayIndexOutOfBoundsException("Размеры массивов не совпадают!");
        }
        int[] difArr = new int[arr1.length];
        int i, j, k;
        i = j = k = 0;
        while (i < arr1.length) {
            difArr[k] = arr1[i] - arr2[j];
            i++;
            j++;
            k++;
        }
        return difArr;
    }
}
