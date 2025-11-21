package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.math.BigInteger;

public class FactorialTest
{
    @Test
    public void zero() {
        Assert.assertEquals(get(0), BigInteger.valueOf(1));
    }
    private static BigInteger get(int i)
    {
        return null;
    }
    @Test
    public void naturalInt()
    {
        Assert.assertEquals(get(5), BigInteger.valueOf(1));
        Assert.assertEquals(get(6), BigInteger.valueOf(2));
        Assert.assertEquals(get(7), BigInteger.valueOf(3));
        Assert.assertEquals(get(8), BigInteger.valueOf(4));
    }
    @Test
    public void lessZero()
    {
        Assert.assertNull(get(-1));
        Assert.assertNull(get(-2));
    }}