package com.demoblaze.qualityassurance.pages;

import com.microsoft.playwright.Page;
import com.demoblaze.qualityassurance.userInterface.SingUpUF;

public class SingUpPage {

    private final Page page;
    public SingUpPage(Page page) {
        this.page = page;
    }

    public void  signUp() {
        page.click(SingUpUF.signUp);
    }
    public void  setSignUpUserName(String userName) {
        page.fill(SingUpUF.signUpUserName, userName);
    }
    public void  setSignUpPass(String pass) {
        page.fill(SingUpUF.signUpPass, pass);
    }
    public void  signUpButton() {
        page.click(SingUpUF.signUpButton);
    }
}
