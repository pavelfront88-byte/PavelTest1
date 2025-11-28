import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.className;


public class mtstest
{
    static WebDriver driver;

    @BeforeAll
    static void init()
    {
        driver = new ChromeDriver();
    }

    @Test //1
    void title()
    {
        try {
            WebElement title = driver.findElement(className("pay h2"));
            System.out.println();
        } catch (NoSuchElementException e)
        {
            System.err.println();
        }
    }

    @Test //4
    void payForm() {
        try {
            driver.findElement(className("phone")).sendKeys("297777777");
            driver.findElement(className("sum")).sendKeys("77");
            driver.findElement(className("section.pay")).click();
            driver.findElement(By.name("frame 8458"));
            System.out.println("окно открылось");
        } catch (NoSuchElementException e) {
            System.err.println("не найден");
        }

    }
}