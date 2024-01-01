package org.exemple.features;

import org.exemple.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{
    private String productName = "iPod Nano";
    @Test
    public void addToCartTest() throws InterruptedException {
//        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        searchSteps.goToProductPage(productName);
        cartSteps.clickOnAddToCartButton();
        cartSteps.productIsInCartMessage(productName);

    }
}
