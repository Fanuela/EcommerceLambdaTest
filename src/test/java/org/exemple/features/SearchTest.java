package org.exemple.features;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void searchForProductKeywordTest(){
        searchSteps.searchForKeyword(productName);
        searchSteps.clickOnSearchIcon();
        searchSteps.verifyProductIsInList(productName);
    }
    @Test
    public void verifyPriceAscendingTest() {
        searchSteps.searchForKeyword(productName);
        searchSteps.clickOnSearchIcon();
        searchSteps.orderProductsByPrice();
        searchSteps.productsAreSortedByPriceAscending();

    }

}
