package org.example;
public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500};
        System.out.println(+numbers.length);
        try {
            System.out.println(+numbers[100]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Ошибка");
            System.err.println("Исключения"+e.getMessage());
        }}}