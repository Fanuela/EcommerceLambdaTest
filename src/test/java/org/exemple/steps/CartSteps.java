package org.exemple.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{
    @Step
    public void clickOnAddToCartButton(){
        productPage.clickOnAddToCartButton();
    }
    @Step
    public void productIsInCartMessage(String productName){
      productPage.verifyIfProductIsInCart(productName);
    }
    @Step
    public void addProductToCart(String productName){
        clickOnAddToCartButton();;
        productIsInCartMessage(productName);
    }
    @Step
    public void clickOnViewCart(){
        searchPage.clickOnViewCartButton();
    }
    @Step
    public void removeProductFromCart(){
        cartPage.clickOnRemoveFromCartButton();
    }
    @Step
    public void verifyIfProductWasDeletedFromCart(){
        Assert.assertEquals("Your shopping cart is empty!",cartPage.productWasDeletedFromCart());
    }
    @Step
    public void goToWishList(){
        productPage.clickOnContinueToWishListButton();
    }
    @Step
    public void addToCartFromWishList(){
        wishListPage.clickOnAddToCartButton();
    }
    @Step
    public void addThreeProductsToCart(){
        productPage.clickOnIncreaseQuantityButton();
    }
}
