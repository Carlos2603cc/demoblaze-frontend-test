package com.demoblaze.qualityassurance.pages;

import com.microsoft.playwright.Page;

public class ProdPage {

    Page page;
    Page popup;

    private String addToCar = "#tbodyid > div.row > div > a";
    private String popUpButton = "#Aceptar";
    private String buttonCar  ="#cartur";

    public ProdPage(Page page){
        this.page = page;
    }

    public void  setAddToCar(){
        page.click(addToCar);
    }

    public void clickOnPopUpButton(){
        popup.click(popUpButton);
    }

    public void clickOnButtonCar(){
        page.click(buttonCar);
    }
}
