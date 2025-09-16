package Utilities;

import org.openqa.selenium.WebDriver;

public class WebDriverProvider {

    private final static ThreadLocal<WebDriver> threadlocal = new ThreadLocal<>();

    public void set(WebDriver driver) {
        threadlocal.set(driver);
    }

    public WebDriver get() {
        return threadlocal.get();
    }
}
