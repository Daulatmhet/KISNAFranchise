package com.Sdaemon.factories;

import com.Sdaemon.Driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
public class FluentWaitFactory {
public static void waitForElement(WebElement element) {
    FluentWait<WebDriver> wait = new FluentWait<>(DriverManager.getDriver())
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NoSuchElementException.class)
            .ignoring(StaleElementReferenceException.class)
            .ignoring(ElementClickInterceptedException.class);

    wait.until(driver -> {
        try {
            return element.isDisplayed(); // You can also check `.isEnabled()` if needed
        } catch (StaleElementReferenceException e) {
            return false;
        }
    });

}
}




