import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

public class factorialtest
{
    @Test
    void zero()
    {
        Assertions.assertEquals(BigInteger.valueOf(1), factorialtest.get(0));
    }
    private static BigInteger get(int i)
    {
        return null;
    }
    @Test
    void naturalInt()
    {
        Assertions.assertEquals(BigInteger.valueOf(1), factorialtest.get(5));
        Assertions.assertEquals(BigInteger.valueOf(2), factorialtest.get(6));
        Assertions.assertEquals(BigInteger.valueOf(3), factorialtest.get(7));
        Assertions.assertEquals(BigInteger.valueOf(4), factorialtest.get(8));
    }
    @Test
    void lessZero()
    {
        Assertions.assertNull(factorialtest.get(-1));
        Assertions.assertNull(factorialtest.get(-2));
    }}