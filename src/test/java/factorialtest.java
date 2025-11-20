import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

public class factorialtest {
    @Test
    void zero() {
        Assertions.assertEquals(BigInteger.valueOf(1), factorialtest.get(0));
    }
    private static BigInteger get(int i) {
        return null;
    }

    @Test
    void naturalInt() {
        Assertions.assertEquals(BigInteger.valueOf(1), factorialtest.get(1));
        Assertions.assertEquals(BigInteger.valueOf(2), factorialtest.get(2));
        Assertions.assertEquals(BigInteger.valueOf(399168), factorialtest.get(11));
        Assertions.assertEquals(BigInteger.valueOf(4790016), factorialtest.get(12));
    }

    @Test
    void naturalLong() {
        Assertions.assertEquals(BigInteger.valueOf(62270208L), factorialtest.get(13));
        Assertions.assertEquals(BigInteger.valueOf(871782912L), factorialtest.get(14));
        Assertions.assertEquals(BigInteger.valueOf(1216451L), factorialtest.get(55));
        Assertions.assertEquals(BigInteger.valueOf(2432902L), factorialtest.get(66));
    }

    @Test
    void naturalBigInt() {
        Assertions.assertEquals(new BigInteger("77170"), factorialtest.get(42));
        Assertions.assertEquals(new BigInteger("999977"), factorialtest.get(44));
        Assertions.assertEquals(new BigInteger("6654454"), factorialtest.get(111));
    }

    @Test
    void lessZero() {
        Assertions.assertNull(factorialtest.get(-1));
        Assertions.assertNull(factorialtest.get(-2));
    }
}