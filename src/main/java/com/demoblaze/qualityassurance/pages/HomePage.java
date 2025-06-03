package com.demoblaze.qualityassurance.pages;


import com.demoblaze.qualityassurance.utils.ScreenshotHelper;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import com.demoblaze.qualityassurance.userInterface.HomeUF;
public class HomePage {

    private final Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void  selectItem() {
        page.locator(HomeUF.fristElement).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.click(HomeUF.fristElement);
    }

    public Locator getWelcome() {
        page.locator(HomeUF.welcome).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        ScreenshotHelper.attachScreenshot(page);
        page.locator(HomeUF.welcome).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        return page.locator(HomeUF.welcome);
    }
}
