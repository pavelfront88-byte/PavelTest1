package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CompareNumbersTest {

    @Test
    public void testCompareLess() {
        String result = CompareNumbers.compare(3, 7);
        Assert.assertEquals(result, "3<7");
    }

    private static class CompareNumbers {
        public static String compare(int i, int i1) {
            return "";
        }
    }
}



