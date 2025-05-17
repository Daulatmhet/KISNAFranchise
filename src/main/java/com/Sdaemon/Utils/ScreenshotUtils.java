package com.Sdaemon.Utils;

import com.Sdaemon.Driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScreenshotUtils {

    private ScreenshotUtils(){}

    public static String getBase64Image(){

        //WebDriverWait wait = DriverManager.getDriver(); // adjust based on your setup


        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);

    }

}
