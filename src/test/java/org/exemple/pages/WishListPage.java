package org.exemple.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{
    @FindBy(css = "#content > div.table-responsive > table > tbody > tr > td.text-right.text-nowrap > button > i")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".alert-dismissible")
    private WebElementFacade deleteProductButton;
    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);

    }
}
