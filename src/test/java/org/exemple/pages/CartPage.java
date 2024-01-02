package org.exemple.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(css = ".btn.btn-danger")
    private WebElementFacade removeFromCartButton;
    @FindBy(css = "#content > p")
    private WebElementFacade cartIstEmptyMessage;


    public void clickOnRemoveFromCartButton(){
        clickOn(removeFromCartButton);
    }
    public String productWasDeletedFromCart(){
        return cartIstEmptyMessage.getText();

    }
}
