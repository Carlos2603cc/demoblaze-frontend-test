package com.demoblaze.qualityassurance.tests;

import com.demoblaze.qualityassurance.factory.PlaywrightFactory;
import com.demoblaze.qualityassurance.tasks.*;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.*;

public class AddToCarTest {
    static PlaywrightFactory pf;
    static Page page;
    static Car car;
    static Purchase purchase;
    static SingUpAndLogin singUpAndLogin;


    @BeforeEach
    public void setup() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser("chromium");
        car = new Car(page);
        purchase = new Purchase(page);
        singUpAndLogin = new SingUpAndLogin(page);

    }

    @Test
    public void addProductToCar() {
        Assertions.assertEquals(car.addProduct(), "Delete");
    }

    @Test
    public void completePurchase() {
        Assertions.assertEquals(purchase.complete(),"Thank you for your purchase!");
    }

    @Test
    public void signUp_logIn() {
        Assertions.assertTrue(singUpAndLogin.successful().isVisible());
    }

    @AfterEach
    public void tearDown() {
        page.context().browser().close();
    }

}
