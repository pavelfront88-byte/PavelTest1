import static org.junit.jupiter.api.Assertions.*;
import org.example.Triangle;
import org.junit.jupiter.api.Test;

class TriangleTest
{
    @Test
    void testCalculateArea_ValidTriangle()
    {
        double area = Triangle.calculateArea(3, 4, 5);
        assertEquals(6.0, area, 1e-10);
    }}