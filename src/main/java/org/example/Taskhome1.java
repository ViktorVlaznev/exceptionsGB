package org.example;

/** Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taskhome1 {
    public static void main(String[] args) throws MyException, IOException, NumberFormatException {
        Taskhome1 task1 = new Taskhome1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder weight;
        System.out.print("Введите Ваш вес: ");

        //* test1*/
//        weight  = task1.inputWeight1(reader);

        //* test2*/
//        weight  = task1.inputWeight2(reader);

        //* test3*/
        weight  = task1.inputWeight3(reader);

        System.out.println("Ваш вес: " + weight + " кг!");
    }
    public StringBuilder inputWeight1(BufferedReader r) throws  IOException{
        StringBuilder w1 = new StringBuilder(r.readLine());
        if (w1.length() == 0) {
            throw new IOException("Ввод не может быть пустым. Повторите ввод.");
        }
        return w1;
    }
    public StringBuilder inputWeight2(BufferedReader r) throws MyException, IOException {
        StringBuilder w2 = new StringBuilder(r.readLine());
        if (Integer.parseInt(w2.toString().trim()) <= 0) {
            throw new MyException("Вес не может быть отрицательным. Повторите попытку.");
        }
        return w2;
    }
    public StringBuilder inputWeight3(BufferedReader r) throws IOException {
        StringBuilder w3 = new StringBuilder(r.readLine());
        try {
            Integer.parseInt(w3.toString());
        } catch (NumberFormatException e) {
            System.out.println("Введено не число! Повторите попытку.");
            System.exit(0);
        }
        return w3;
    }
    public class MyException extends Exception {
        public MyException(String errorMessage) {
            super(errorMessage);
        }
    }
}

