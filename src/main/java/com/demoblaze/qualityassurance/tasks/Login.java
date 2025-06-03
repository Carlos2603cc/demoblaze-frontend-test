package com.demoblaze.qualityassurance.tasks;

import com.demoblaze.qualityassurance.pages.LoginPage;
import com.microsoft.playwright.Page;

public class Login {

    static LoginPage loginPage;

    public Login(Page page) {
        loginPage = new LoginPage(page);
    }

    public void successful(String id){
        loginPage.login();
        loginPage.setLoginUserName("carlos"+ id);
        loginPage.setLoginPass(id);
        loginPage.loginButton();
    }
}
