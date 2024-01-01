package org.exemple.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForKeyword(String value){
        homePage.setSearchField(value);
    }
    @Step
    public void clickOnSearchIcon(){
        homePage.clickOnSearchIcon();
    }
    @Step
    public void verifyProductIsInList(String productName){
       Assert.assertTrue(searchPage.isProductInList(productName));
    }
    @Step
    public void orderProductsByPrice(){
        searchPage.selectPriceFromDropDown();
    }
    @Step
    public void productsAreSortedByPriceAscending(){
        Assert.assertTrue("The price is not sorted ascending!",searchPage.priceIsAscending());
    }
    @Step
    public void goToProductPage(String productName){
        searchForKeyword(productName);
        clickOnSearchIcon();
        verifyProductIsInList(productName);
    }
}
