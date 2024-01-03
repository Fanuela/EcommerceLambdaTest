package org.exemple.features;

import org.exemple.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{
    private String productName = "iPod Nano";
    @Test
    public void addToCartTest(){
//        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        searchSteps.goToProductPage(productName);
        cartSteps.clickOnAddToCartButton();
        cartSteps.productIsInCartMessage(productName);
    }
    @Test
    public void addThreeProductsToCartTest() {
//        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        searchSteps.goToProductPage(productName);
        cartSteps.addThreeProductsToCart();
        cartSteps.clickOnAddToCartButton();
        cartSteps.productIsInCartMessage(productName);
    }
    @Test
    public void removeProductFromCartTest(){
        searchSteps.goToProductPage(productName);
        cartSteps.addProductToCart(productName);
        cartSteps.clickOnViewCart();
        cartSteps.removeProductFromCart();
        cartSteps.verifyIfProductWasDeletedFromCart();

    }
    @Test
    public void addProductToCartFromWishList(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        searchSteps.goToProductPage(productName);
        addToWishListSteps.removeProductFromWishList();
        addToWishListSteps.addProductWithVerificationToWishList(productName);
        cartSteps.goToWishList();
        cartSteps.addToCartFromWishList();
        cartSteps.productIsInCartMessage(productName);
    }
}
