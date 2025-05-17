package com.Sdaemon.pages;

import com.Sdaemon.Driver.DriverManager;
import com.Sdaemon.Enums.WaitStrategy;
import org.openqa.selenium.By;

public class HomePage extends BasePage{


    public final By walkIn  = By.xpath("//button[@title='Walk-in']");
    public final By Addsalesentry = By.xpath("//button[@title='Add Sales Entry']");
     public final By customerMasterpage = By.xpath("//h5[.='Customer master']");
      public final By Estimatepaymentresceipt = By.xpath("//button[@title='Add Estimate/Payment Receipt ']");
       public final By Returnproduct = By.xpath("//button[@title='Return Product ']");
        public final By RepairProduct = By.xpath("//button[@title='Repair Product ']");
        public final By KMR = By.xpath("//button[@title='KMR']");




    public void clickWalkShortcuts(){
      click(walkIn, WaitStrategy.CLICKABLE,"walkinclick");
      return;

    }
// clickingWalkShortcuts and customer should visible
    public boolean isCustomerMasterHeaderVisible() {
        return DriverManager.getDriver().findElement(customerMasterpage).isDisplayed();
    }

    // clicking on AddsalesEntry and Sales Entry page
    public void clickAddSalesEntry(){
        click(Addsalesentry,WaitStrategy.CLICKABLE, "Add sales entry");
    }
    public boolean isSalesEntryVisible(){
        return DriverManager.getDriver().findElement(Addsalesentry).isDisplayed();
    }















}


