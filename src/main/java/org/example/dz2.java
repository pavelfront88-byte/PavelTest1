package org.example;

public class dz2 {public static void checkSumSign()
{
    int a = 5;
    int b = -3;
    int sum = a + b;
    if (sum >= 0)
    {
        System.out.println("positive");
    }
    else
    {
        System.out.println("negative");
    }
}
    public static void main(String[] args) {
        checkSumSign();
    }
}