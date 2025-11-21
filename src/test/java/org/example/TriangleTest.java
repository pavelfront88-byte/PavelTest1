package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TriangleTest
{
    @Test
    public void testValidTriangle()
    {
        double area = Triangle.calculateArea(3, 4, 5);
        Assert.assertEquals(area, 6.0, 1e-10);
    }
    @Test
    public void testEquilateralTriangle()
    {
        double area = Triangle.calculateArea(2, 2, 2);
        double expected = Math.sqrt(3);
        Assert.assertEquals(area, expected, 1e-10);
    }}