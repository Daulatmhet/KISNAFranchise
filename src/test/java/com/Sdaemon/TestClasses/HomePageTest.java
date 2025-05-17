package com.Sdaemon.TestClasses;

import com.Sdaemon.Driver.DriverManager;
import com.Sdaemon.factories.ExplicitWaitFactory;
import com.Sdaemon.pages.HomePage;
import com.Sdaemon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
   @Test
    public void VerifyHomePage(){
        LoginPage page = new LoginPage();

        page.enterusernam("Paschimvihar");
        //  FluentWaitFactory.waitForElement();
        page.enterpassword("Paschimvihar@123");
        page.ClickonSign_inBtn();

        HomePage page1 = new HomePage();
        page1.clickWalkShortcuts();

       String actualUrl = DriverManager.getDriver().getCurrentUrl();
       String expectedUrl = "https://kisnastores.sdaemon.com/CustomerDetails";

       Assert.assertEquals(actualUrl, expectedUrl, "URL does not match after clicking Walk In");

       Assert.assertTrue(page1.isCustomerMasterHeaderVisible(), "Customer Master page was not opened");

   }

}


