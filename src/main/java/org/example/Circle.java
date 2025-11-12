package org.example;
public class Circle
{
    private double radius;
    public Circle(double radius)
    {
        if (radius<=0)
        {
            throw new IllegalArgumentException("Радиус+");
        }
        this.radius = radius;
    }}
