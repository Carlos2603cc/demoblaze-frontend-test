package com.demoblaze.qualityassurance.pages;

import com.microsoft.playwright.Page;

public class CarPage {

    Page page;

    private String buttonDelete = "#tbodyid > tr > td:nth-child(4) > a";
    private String buttonPlaceOrder = "#page-wrapper > div > div.col-lg-1 > button";
    private String Name = "#name";
    private String Contry = "#country";
    private String City = "#city";
    private String CreditCard = "#card";
    private String Month = "#month";
    private String Year = "#year";
    private String buttonPurchae = "#orderModal > div > div > div.modal-footer > button.btn.btn-primary";
    private String buttonOk = "body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button";
    private String successfulPurchase = "body > div.sweet-alert.showSweetAlert.visible > h2";

    public  CarPage(Page page){this.page = page;}

    public String  buttonDelete(){
        return page.textContent(buttonDelete);
    }

    public void clickOnbuttonPlaceOrder(){
        page.click(buttonPlaceOrder);
    }
    public void enterName(String name){
        page.fill(Name, name);
    }

    public void enterContry(String contry){
        page.fill(Contry, contry);
    }
    public void enterCity(String city){
        page.fill(City, city);
    }
    public void enterCreditCard(String creditCar){
        page.fill(CreditCard, creditCar);
    }
    public void enterMonth(String month){
        page.fill(Month, month);
    }
    public void enterYear(String year){
        page.fill(Year, year);
    }

    public void clickOnbuttonPurchase(){
        page.click(buttonPurchae);
    }
    public void clickOnbuttonOk(){
        page.click(buttonOk);
    }

    public String  getSuccessfulPurchase(){
        return page.textContent(successfulPurchase);
    }


}
