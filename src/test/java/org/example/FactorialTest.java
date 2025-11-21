package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.math.BigInteger;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        BigInteger result = Factorial.get(0);
        Assert.assertEquals(result, BigInteger.ONE, "0# должен быть равен 1");
    }

    @Test
    public void testFactorialOne() {
        BigInteger result = Factorial.get(1);
        Assert.assertEquals(result, BigInteger.ONE, "1# должен быть равен 1");
    }

    @Test
    public void testFactorialFive() {
        BigInteger result = Factorial.get(5);
        Assert.assertEquals(result, new BigInteger("120"), "5# должен быть равен 120");
    }

    @Test
    public void testFactorialTen() {
        BigInteger result = Factorial.get(10);
        Assert.assertEquals(result, new BigInteger("3628800"), "10# должен быть равен 3 628 800");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testFactorialNegative() {
        Factorial.get(-1);
    }

    @Test
    public void testFactorialLargeNumber() {
        BigInteger result = Factorial.get(20);
        Assert.assertEquals(result, new BigInteger("2432902008176640000"), "20# должен быть равен 2 432 902 008 176 640 000");
    }
}