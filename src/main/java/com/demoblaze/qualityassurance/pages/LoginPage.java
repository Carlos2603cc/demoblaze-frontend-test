package com.demoblaze.qualityassurance.pages;

import com.demoblaze.qualityassurance.userInterface.HomeUF;
import com.demoblaze.qualityassurance.userInterface.LoginUF;
import com.demoblaze.qualityassurance.utils.ScreenshotHelper;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class LoginPage {

    private final Page page;
    public LoginPage(Page page) {
        this.page = page;
    }

    public void login(){
        page.click(LoginUF.login);
    }
    public void setLoginUserName(String userName){
        page.locator(LoginUF.loginUserName).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.fill(LoginUF.loginUserName, userName);
    }
    public void setLoginPass(String pass){
        page.fill(LoginUF.loginPass, pass);
    }
    public void loginButton(){
        page.locator(LoginUF.loginButton).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.click(LoginUF.loginButton);
    }
}
