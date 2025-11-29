
import org.example.PayFrame;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PayFrameTest {
    public static WebDriver driver;
    public static PayFrame payFrame;
    public static final String PAGE_URL = "https://mts.by";
    public static final String TEST_PHONE_NUMBER = "297777777";
    public static final String TEST_SUM = "77.77";

    @BeforeAll
      static void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);


    }
    @AfterAll
     static void after() {
        driver.quit();
    }

    @Test
    void descriptionCost() {
        String name = "Текст описания суммы";
        try {
            String actualValue = payFrame.getPayFrameDescriptionCost();
            assertEquals(TEST_SUM + "BYN", actualValue, name + "не совпадает");
            System.out.println(name + "совпадает:" + payFrame.getPayFrameDescriptionCost());
        } catch (NoSuchElementException e) {
            assertTrue(false, name + "не найден");
        }
    }
    @Test
    void btnText() {
        String name = "Текст кнопки";
        try {
            String actualValue = payFrame.getPayFrameBtnText();
            assertEquals("Оплатить" + TEST_SUM + "BYN", actualValue, name + "не совпадает");
            System.out.println(name + "совпадает:" + actualValue);
        } catch (NoSuchElementException e) {
            assertTrue(false, name + "не найден");
        }
    }
    @Test
    void descriptionPhone() {
        String name = "Номер телефона";
        try {
            String actualValue = payFrame.getPayFrameDescriptionPhone();
            assertEquals("Оплата: Услуги связи" + TEST_PHONE_NUMBER, actualValue, name + "не совпадает");
            System.out.println(name + "совпадает:" + actualValue);
        } catch (NoSuchElementException e) {
            assertTrue(false, name + "не найден");
        }
    }}


