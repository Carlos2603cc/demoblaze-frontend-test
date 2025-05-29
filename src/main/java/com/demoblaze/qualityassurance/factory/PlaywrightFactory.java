package com.demoblaze.qualityassurance.factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;

    public Page initBrowser(String browserNamer) {

        System.out.println("browser name is : " + browserNamer);
        playwright = Playwright.create();

        switch (browserNamer.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "safari":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
                break;
            default:
                System.out.println("please pass the right browser name.....");
        }
        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate("https://www.demoblaze.com/");

        return page;
    }
}
