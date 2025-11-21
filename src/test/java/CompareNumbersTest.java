import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.CompareNumbers;
import org.junit.jupiter.api.Test;

class CompareNumbersTest
{
    @Test
    void testThreeLessThanSeven()
    {
        String result = CompareNumbers.compare(3, 7);
        assertEquals("3<7", result);
    }
    @Test
    void testSevenGreaterThanThree()
    {
        String result = CompareNumbers.compare(7, 3);
        assertEquals("7>3", result);
    }
    @Test
    void testEqualNumbers()
    {
        String result = CompareNumbers.compare(5, 5);
        assertEquals("5=5", result);
    }}