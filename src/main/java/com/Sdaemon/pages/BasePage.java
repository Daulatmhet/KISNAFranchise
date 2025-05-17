package com.Sdaemon.pages;

import com.Sdaemon.Driver.DriverManager;
import com.Sdaemon.Enums.WaitStrategy;
import com.Sdaemon.Reports.ExtentLogger;
import com.Sdaemon.factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected void click(By by, WaitStrategy waitStrategy, String elementname) {

        /*
         * We want to make sure can only choose from list of predefined options
         *
         */

        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.click();
        try {
            ExtentLogger.pass(elementname+"is clicked",true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected void sendkeys(By by, String value, WaitStrategy waitstrategy, String elementname) {

        WebElement element=	ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
        element.sendKeys(value);
        try {
            ExtentLogger.pass(value+ "is entered sucessfully in"+ elementname , true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

    private void explicitWaitForElementToBeClickable(By by , int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    private void explicitWaitForElementToBePresent(By by) {

    }


}




