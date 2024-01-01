package org.exemple.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = "li.dropdown:nth-child(6)")
    private WebElementFacade myAccountButton;

    @FindBy(css = "#entry_217822 > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    private WebElementFacade searchField;
    @FindBy(css = ".search-button .type-text")
    private WebElementFacade searchIcon;


    public void clickOnMyAccountButton(){
        clickOn(myAccountButton);
    }
    public void setSearchField(String value){
        typeInto(searchField,value);
    }
    public void clickOnSearchIcon(){
        clickOn(searchIcon);
    }



}
