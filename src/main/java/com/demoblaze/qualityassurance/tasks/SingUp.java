package com.demoblaze.qualityassurance.tasks;

import com.demoblaze.qualityassurance.pages.SingUpPage;
import com.microsoft.playwright.Page;

public class SingUp {

    static SingUpPage singUpPage;

    public SingUp(Page page) {
        singUpPage = new SingUpPage(page);
    }

    public void successful(String id){
        singUpPage.signUp();
        singUpPage.setSignUpUserName("carlos"+ id);
        singUpPage.setSignUpPass(id);
        singUpPage.signUpButton();
    }
}
