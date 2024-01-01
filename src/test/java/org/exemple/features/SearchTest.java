package org.exemple.features;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void searchForProductKeywordTest(){
        searchSteps.searchForKeyword("pro");
        searchSteps.clickOnSearchIcon();
        searchSteps.verifyProductIsInList("Palm Treo Pro");
    }
    @Test
    public void verifyPriceAscendingTest() {
        searchSteps.searchForKeyword("pro");
        searchSteps.clickOnSearchIcon();
        searchSteps.orderProductsByPrice();
        searchSteps.productsAreSortedByPriceAscending();

    }

}
