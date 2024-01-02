package org.exemple.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AddToWishListSteps extends BaseSteps {
    @Step
    public void addProductToWishList(){
        productPage.clickOnAddToWishListButton();

    }
    @Step
    public void verifySuccessAddedProductToWishList(String productName){
        productPage.productWasAddedToWish(productName);

    }
    @Step
    public void removeProductFromWishList(){
        productPage.clickOnRemoveProductFromWishList();
    }
    @Step
    public void addProductWithVerificationToWishList(String productName){
        addProductToWishList();
        verifySuccessAddedProductToWishList(productName);
    }
}
