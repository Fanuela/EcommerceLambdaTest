package org.exemple.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(id = "entry_216842")
    private WebElementFacade addToCartButton;
    @FindBy(css = "div.align-items-start:nth-child(1) > p:nth-child(2)")
    private WebElementFacade successAddedToCartMessage;


    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);
    }
    public boolean verifyIfProductIsInCart(String productName){
        return successAddedToCartMessage.getText().equalsIgnoreCase( "Success: You have added " +  productName + " to your shopping cart!" );

    }

}
