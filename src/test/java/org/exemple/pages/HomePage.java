package org.exemple.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = "li.dropdown:nth-child(6)")
    private WebElementFacade myAccountButton;

    @FindBy(css = "#entry_217822 input[type='text']")
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
