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
}
