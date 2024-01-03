package org.exemple.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(id = "entry_216842")
    private WebElementFacade addToCartButton;
    @FindBy(css = "div.align-items-start:nth-child(1) > p:nth-child(2)")
    private WebElementFacade successAddedToCartMessage;
    @FindBy(css = "#entry_216811 .wishlist-29")
    private WebElementFacade addToWishListButton;
    @FindBy(css = "#entry_216811 .wished")
    private WebElementFacade removeProductFromWishList;
    @FindBy(css = "#notification-box-top > div > div.toast-body > div > p")
    private WebElementFacade successAddedToWishListMessage;
    @FindBy(css = "#notification-box-top > div > div.toast-body > a")
    private WebElementFacade continueToWishListButton;
    @FindBy(css = "#entry_216841 .input-group-append")
    private WebElementFacade increaseQuantityButton;


    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);
    }
    public boolean verifyIfProductIsInCart(String productName){
        return successAddedToCartMessage.getText().equalsIgnoreCase( "Success: You have added " +  productName + " to your shopping cart!" );

    }
    public void clickOnAddToWishListButton(){
        clickOn(addToWishListButton);
    }
    public boolean productWasAddedToWish(String productName){
      return   successAddedToWishListMessage.getText().equalsIgnoreCase("Success: You have added"+ productName+"to yourwish list]!");
    }
    public void clickOnRemoveProductFromWishList(){
        clickOn(removeProductFromWishList);
    }
    public void clickOnContinueToWishListButton(){
        clickOn(continueToWishListButton);
    }
    public void clickOnIncreaseQuantityButton(){
        clickOn(increaseQuantityButton);
        clickOn(increaseQuantityButton);
    }

}
