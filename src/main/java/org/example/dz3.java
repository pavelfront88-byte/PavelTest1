package org.example;

public class dz3 {
    public void printColor()
    {
        int value =50;
        if (value <=0)
        {
            System.out.println("red");
        } else if (value > 0 && value <=100)
        {
            System.out.println("yellow");
        } else
        {
            System.out.println("green");
        }
    }
    public static void main(String[] args)
    {
        dz3 instance = new dz3();
        instance.printColor();
    }
}
