package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.web.Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    //создание экземпляра драйвера
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        Web.driver = new ChromeDriver();
        Web.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void close() {
        Web.driver.quit();
    }
}
