package com.demoblaze.qualityassurance.pages;

import com.demoblaze.qualityassurance.userInterface.ProdUF;
import com.demoblaze.qualityassurance.utils.ScreenshotHelper;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.demoblaze.qualityassurance.userInterface.CarUF;
import com.microsoft.playwright.options.WaitForSelectorState;

public class CarPage {

    Page page;

    public  CarPage(Page page){this.page = page;}

    public String  buttonDelete(){
        page.locator(CarUF.buttonDelete).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        return page.textContent(CarUF.buttonDelete);
    }

    public void clickOnbuttonPlaceOrder(){
        page.locator(CarUF.buttonPlaceOrder).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.click(CarUF.buttonPlaceOrder);
    }
    public void enterName(String name){
        page.locator(CarUF.Name).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.fill(CarUF.Name, name);
    }

    public void enterContry(String contry){
        ScreenshotHelper.attachScreenshot(page);
        page.fill(CarUF.Contry, contry);
    }
    public void enterCity(String city){
        ScreenshotHelper.attachScreenshot(page);
        page.fill(CarUF.City, city);
    }
    public void enterCreditCard(String creditCar){
        ScreenshotHelper.attachScreenshot(page);
        page.fill(CarUF.CreditCard, creditCar);
    }
    public void enterMonth(String month){
        ScreenshotHelper.attachScreenshot(page);
        page.fill(CarUF.Month, month);
    }
    public void enterYear(String year){
        ScreenshotHelper.attachScreenshot(page);
        page.fill(CarUF.Year, year);
    }

    public void clickOnbuttonPurchase(){
        page.locator(CarUF.buttonPurchae).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.click(CarUF.buttonPurchae);
    }
    public void clickOnbuttonOk(){
        page.locator(CarUF.buttonOk).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.click(CarUF.buttonOk);
    }

    public String  getSuccessfulPurchase(){
        page.locator(CarUF.buttonDelete).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        return page.textContent(CarUF.successfulPurchase);
    }


}
