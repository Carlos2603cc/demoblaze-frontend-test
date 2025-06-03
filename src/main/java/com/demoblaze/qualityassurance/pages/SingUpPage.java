package com.demoblaze.qualityassurance.pages;

import com.demoblaze.qualityassurance.userInterface.LoginUF;
import com.demoblaze.qualityassurance.utils.ScreenshotHelper;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.demoblaze.qualityassurance.userInterface.SingUpUF;
import com.microsoft.playwright.options.WaitForSelectorState;

public class SingUpPage {

    private final Page page;
    public SingUpPage(Page page) {
        this.page = page;
    }

    public void  signUp() {

        page.click(SingUpUF.signUp);
    }
    public void  setSignUpUserName(String userName) {
        page.locator(SingUpUF.signUpUserName).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.fill(SingUpUF.signUpUserName, userName);
    }
    public void  setSignUpPass(String pass) {
        page.fill(SingUpUF.signUpPass, pass);
    }
    public void  signUpButton() {
        page.locator(SingUpUF.signUpButton).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.click(SingUpUF.signUpButton);
    }
}
