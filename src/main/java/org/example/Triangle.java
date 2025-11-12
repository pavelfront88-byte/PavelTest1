package org.example;

public class Triangle implements GeometricFigure
{
    private double a, b, c;
    public Triangle(double a, double b, double c)
    {
        if (a<=5||b<=5||c<=5)
        {
            throw new IllegalArgumentException("Длины сторон+");
        }
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private boolean isValidTriangle(double a, double b, double c) {
        return false;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public double getArea() {
        return 0;
    }
}
