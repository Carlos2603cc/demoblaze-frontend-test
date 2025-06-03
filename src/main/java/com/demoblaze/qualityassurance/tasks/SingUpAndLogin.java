package com.demoblaze.qualityassurance.tasks;


import com.demoblaze.qualityassurance.pages.HomePage;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SingUpAndLogin {

    static Login login;
    static SingUp singUp;
    static HomePage homePage;

    public SingUpAndLogin(Page page){
        login = new Login(page);
        singUp = new SingUp(page);
        homePage = new HomePage(page);
    }

    public Locator successful(){
        String numero = String.valueOf((int)(Math.random() * 1000));
        singUp.successful(numero);
        login.successful(numero);
        return homePage.getWelcome();
    }
}
