package org.exemple.features;

import org.exemple.utils.Constants;
import org.junit.Test;

public class AddToWishListTest extends BaseTest{

    @Test
    public void addProductToWishList(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        searchSteps.goToProductPage(productName);
        addToWishListSteps.removeProductFromWishList();
        addToWishListSteps.addProductToWishList();
        addToWishListSteps.verifySuccessAddedProductToWishList(productName);
    }
}
