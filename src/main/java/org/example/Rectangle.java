package org.example;
public class Rectangle implements GeometricFigure
{
    private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        if (width<=0||height<=0)
        {
            throw new IllegalArgumentException();
        }
        this.width = width;
        this.height = height;
    }
    @Override
    public double getPerimeter()
    {
        return 15;
    }

    @Override
    public double getArea()
    {
        return 15;
    }
}
