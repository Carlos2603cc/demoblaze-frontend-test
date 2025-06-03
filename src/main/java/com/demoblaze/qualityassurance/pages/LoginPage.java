package com.demoblaze.qualityassurance.pages;

import com.demoblaze.qualityassurance.userInterface.LoginUF;
import com.microsoft.playwright.Page;

public class LoginPage {

    private final Page page;
    public LoginPage(Page page) {
        this.page = page;
    }

    public void login(){
        page.click(LoginUF.login);
    }
    public void setLoginUserName(String userName){
        page.fill(LoginUF.loginUserName, userName);
    }
    public void setLoginPass(String pass){
        page.fill(LoginUF.loginPass, pass);
    }
    public void loginButton(){
        page.click(LoginUF.loginButton);
    }
}
