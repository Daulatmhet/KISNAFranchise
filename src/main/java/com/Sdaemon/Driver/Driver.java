package com.Sdaemon.Driver;
import com.Sdaemon.Enums.ConfigProperies;
import com.Sdaemon.Utils.PropertyUtil;
import com.Sdaemon.factories.ExplicitWaitFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    private Driver(){}

    private static WebDriver driver;

   public static void initDriver() throws Exception {
       if(Objects.isNull(DriverManager.getDriver())) {
           WebDriverManager.chromedriver().setup();
           DriverManager.setDriver( new ChromeDriver() );
           DriverManager.getDriver().get(PropertyUtil.get(ConfigProperies.URL));
          // DriverManager.getDriver().get(PropertyUtil.get(ConfigProperies.));
           //ExplicitWaitFactory.wai
           DriverManager.getDriver().manage().window().maximize();
       }
   }

   public static void quitDriver(){

       if(Objects.nonNull(DriverManager.getDriver()))
       {
            DriverManager.getDriver().quit();
           DriverManager.unload();
       }
   }

}





