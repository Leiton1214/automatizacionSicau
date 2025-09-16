package Utilities;

import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.time.Duration;

@Listeners({AllureTestNg.class})
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void mastersetUp() {
        Logs.debug("Analizar el driver");
        driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        // Opciones recomendadas en runners de CI
        options.addArguments("--headless=new");     // modo headless (o "--headless")
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Con Selenium 4.6+ Selenium Manager resuelve el driver automáticamente.
        //driver = new ChromeDriver(options);

        Logs.debug("Mazimizar el drive");
        driver.manage().window().maximize();

        Logs.debug("Quitar cokees");
        driver.manage().deleteAllCookies();

        Logs.debug("Tiempos de espera");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        new WebDriverProvider().set(driver);
    }

    @AfterMethod
    public void tearDown() {
        Logs.debug("Finalizar el driver");
        driver.quit();
    }
}
