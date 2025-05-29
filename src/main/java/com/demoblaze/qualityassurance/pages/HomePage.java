package com.demoblaze.qualityassurance.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class HomePage {

    private Page page;

    private String fristElement = "#tbodyid > div:nth-child(1) > div > a";
    private String signUp = "#signin2";
    private String login = "#login2";
    private String signUpUserName = "#sign-username";
    private String signUpPass = "#sign-password";
    private String signUpButton ="#signInModal > div > div > div.modal-footer > button.btn.btn-primary";
    private String loginButton = "#logInModal > div > div > div.modal-footer > button.btn.btn-primary";
    private String loginUserName = "#loginusername";
    private String loginPass = "#loginpassword";
    private String welcome = "#nameofuser";

    public HomePage(Page page) {
        this.page = page;
    }

    public void  selectItem() {
        page.click(fristElement);
    }

    public void  signUp() {
        page.click(signUp);
    }

    public void login(){
        page.click(login);
    }

    public void  setSignUpUserName(String userName) {
        page.fill(signUpUserName, userName);
    }
    public void  setSignUpPass(String pass) {
        page.fill(signUpPass, pass);
    }
    public void  signUpButton() {
        page.click(signUpButton);
    }

    public void setLoginUserName(String userName){
        page.fill(loginUserName, userName);
    }
    public void setLoginPass(String pass){
        page.fill(loginPass, pass);
    }
    public void loginButton(){
        page.click(loginButton);
    }

    public Locator getWelcome() {
        page.locator(welcome).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        return page.locator(welcome);
    }
}
