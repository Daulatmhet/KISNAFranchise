package com.Sdaemon.TestClasses;

import com.Sdaemon.Listener.RetryFailedTests;
import com.Sdaemon.factories.ExplicitWaitFactory;
import com.Sdaemon.factories.FluentWaitFactory;
import com.Sdaemon.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest{

    @Test
    // (retryAnalyzer = RetryFailedTests.class)
    public void VerifyUI() throws InterruptedException {
      //ExplicitWaitFactory.waitForPageToLoad();

       //ExplicitWaitFactory.waitForFullLoad();

        LoginPage page = new LoginPage();

        page.enterusernam("Paschimvihar");
      //  FluentWaitFactory.waitForElement();
        page.enterpassword("Paschimvihar@123");
        page.ClickonSign_inBtn();


     Assert.assertTrue(page.isLogodisplayed(),"Logo is not Displayed");
          Assert.assertEquals(page.getWelcomeText(),"Welcome to Kisna Franchise! \uD83D\uDC4B","welcome text mismatch");
        Assert.assertTrue(page.isForgotPasswordLinkClickable(),"'Forgot Password?' link is not clickable");

    }
}









