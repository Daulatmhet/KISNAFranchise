    package com.Sdaemon.TestClasses;

    import com.Sdaemon.Driver.Driver;
    import com.Sdaemon.Driver.DriverManager;
    import com.Sdaemon.Reports.ExtentReport;
    import com.Sdaemon.factories.ExplicitWaitFactory;
    import com.fasterxml.jackson.databind.ser.Serializers;
    import org.openqa.selenium.By;
    import org.testng.annotations.*;

    import java.lang.reflect.Method;

    public class BaseTest {

        protected BaseTest() {
        }

        @BeforeSuite
        public void beforeSuite() throws Exception {
            // Initialize ExtentReports before the suite starts
            ExtentReport.initReports();
        }

        @BeforeMethod
       // @Parameters({"waitTimeout"})
        public void setup(Method m) throws Exception {
            //       ExtentReport.createTest(m.getName());
    //        Driver.initDriver();

            String testName;

            if (m == null || m.getName() == null || m.getName().trim().isEmpty()) {
                testName = "Unnamed_Test_" + System.currentTimeMillis(); // Fallback
            } else {
                testName = m.getName();
            }


          //  System.err.println("Test name: " + testName);
            ExtentReport.createTest(testName);

            // Initialize the WebDriver
            Driver.initDriver();

            ExplicitWaitFactory.waitForPageToLoad(DriverManager.getDriver());
          //  ExplicitWaitFactory.waitForPageToLoad();
          //  ExplicitWaitFactory.waitForPageReady(By.xpath("//h5[@class='mb-1  logoColor']"), timeout);

        }

        @AfterMethod
        public void teardown() throws Exception {
       //  Driver.quitDriver();

          //  ExplicitWaitFactory.waitForPageToLoad(DriverManager.getDriver());
           // ExplicitWaitFactory.waitForPageReady(By.xpath("//h5[@class='mb-1  logoColor']"));
        }

        @AfterSuite
        public void afterSuite() throws Exception {
            // Flush the ExtentReports after the suite ends
            ExtentReport.flushreports();



        }
    }







