package com.demoblaze.qualityassurance.pages;

import com.demoblaze.qualityassurance.userInterface.HomeUF;
import com.demoblaze.qualityassurance.utils.ScreenshotHelper;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.demoblaze.qualityassurance.userInterface.ProdUF;
import com.microsoft.playwright.options.WaitForSelectorState;

public class ProdPage {

    Page page;
    Page popup;



    public ProdPage(Page page){
        this.page = page;
    }

    public void  setAddToCar(){
        page.locator(ProdUF.addToCar).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.click(ProdUF.addToCar);
    }

    public void clickOnPopUpButton(){
        page.locator(ProdUF.popUpButton).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        popup.click(ProdUF.popUpButton);
    }

    public void clickOnButtonCar(){
        page.click(ProdUF.buttonCar);
    }
}
