        package com.Sdaemon.factories;

        import com.Sdaemon.Driver.Driver;
        import com.Sdaemon.Driver.DriverManager;
        import com.Sdaemon.Enums.WaitStrategy;
        import com.Sdaemon.constants.FramworkConstants;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import java.time.Duration;

        public class ExplicitWaitFactory {

            public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by) {

                WebElement element = null;
                if (waitStrategy == waitStrategy.CLICKABLE) {

                    element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FramworkConstants.getExplicitwait()))
                            .until(ExpectedConditions.elementToBeClickable(by));
                } else if (waitStrategy == WaitStrategy.PRESENCE) {
                    element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FramworkConstants.getExplicitwait()))
                            .until(ExpectedConditions.elementToBeClickable(by));

                } else if (waitStrategy == WaitStrategy.VISIBLE) {
                    element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FramworkConstants.getExplicitwait()))
                            .until(ExpectedConditions.elementToBeClickable(by));

                } else if (waitStrategy == WaitStrategy.NONE) {
                    element = DriverManager.getDriver().findElement(by);

                }
                return element;

            }

            public static void waitForPageToLoad(WebDriver driver) {
                try {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

                    // ✅ Wait for full JS load
                    wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                            .executeScript("return document.readyState").equals("complete"));

                    // ✅ Optional: Wait for expected URL
                    wait.until(ExpectedConditions.urlContains("Login"));

                    // ✅ MOST IMPORTANT: Wait for stable element to appear
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))); // Change locator if needed

                    System.out.println("Page fully loaded.");

                } catch (Exception e) {
                    System.out.println("Page load timed out or failed: " + e.getMessage());
                    throw new RuntimeException("Page load failed", e);
                }
            }
        }






