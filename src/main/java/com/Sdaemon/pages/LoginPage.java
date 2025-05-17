package com.Sdaemon.pages;

import com.Sdaemon.Driver.DriverManager;
import com.Sdaemon.Enums.WaitStrategy;
import com.Sdaemon.factories.ExplicitWaitFactory;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public final By textbox_username = By.xpath("//input[@id='email']");
    public final By textbox_password = By.xpath("//input[@type='password']");
    public final By Sign_inBtn = By.xpath("//button[.='Sign in']");
    public final By logo = By.xpath("//div[@class='app-brand justify-content-center']/child::a/child::img");
    public final By welcometext = By.xpath("//h5[@class='mb-1  logoColor']");
    public final By forgotPasswordlink = By.xpath("//small[.='Forgot Password?']/parent::a");


    public LoginPage enterusernam(String username) {

        sendkeys(textbox_username, username, WaitStrategy.VISIBLE, "Username");
        return this;
    }

    public LoginPage enterpassword(String password) {

        sendkeys(textbox_password, password, WaitStrategy.VISIBLE, "Password");
        return this;
    }

    public HomePage ClickonSign_inBtn(){

        click(Sign_inBtn,WaitStrategy.CLICKABLE,"SignIn_Btn");
        return new HomePage();
    }

    public String getTitle(){
        return getPageTitle();
    }

    public boolean isLogodisplayed(){

        return DriverManager.getDriver().findElement(logo).isDisplayed();
    }

    public boolean isForgotPasswordLinkClickable(){
        return DriverManager.getDriver().findElement(forgotPasswordlink).isEnabled();
    }

    public String getWelcomeText(){
        return DriverManager.getDriver().findElement(welcometext).getText();
    }


}
