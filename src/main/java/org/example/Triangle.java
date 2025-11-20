package org.example;
public class Triangle {
    public static double calculateArea(double a, double b, double c)
    {
        if (a <= 0 || b <= 0 || c <= 0)
        {
            return -1;
        }
        if (a + b <= c || a + c <= b || b + c <= a)
        {
            return -1;
        }
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }}