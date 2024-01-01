package org.exemple.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {
//    public int getIntFromPrice(String price){
//        return Integer.parseInt(price
//                .replaceAll(".",""));
    public int getIntFromPrice(String value){
    return Integer.parseInt(value
            .replaceAll("\\$","")
            .replaceAll("\\.","")
            .replaceAll(",","")
    );
    }
}
