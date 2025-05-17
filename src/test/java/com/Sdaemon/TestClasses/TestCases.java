package com.Sdaemon.TestClasses;

import com.Sdaemon.Driver.DriverManager;
import com.Sdaemon.Enums.ConfigProperies;
import com.Sdaemon.Utils.PropertyUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestCases  {

    @Test
        public void test3()
        {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://cdbtest.sdaemon.com/Login");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
          driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test02");

        }
            }








