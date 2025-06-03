package com.demoblaze.qualityassurance.utils;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.ScreenshotType;
import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;

public class ScreenshotHelper {

    public static void attachScreenshotWhitDescription(Page page, String name) {
        byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setType(ScreenshotType.PNG));
        Allure.addAttachment(name, new ByteArrayInputStream(screenshot));
    }

    public static void attachScreenshot(Page page) {
        byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setType(ScreenshotType.PNG));
        Allure.addAttachment("->", new ByteArrayInputStream(screenshot));
    }
}
