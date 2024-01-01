package org.exemple.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {
    @FindBy(css = ".text-ellipsis-2")
    private List<WebElementFacade> listOfProductNames;
    @FindBy(css = ".price-new")
    private List<WebElementFacade>listOfProductPrices;
    @FindBy(css = "select#input-sort-212464.custom-select")
    private WebElementFacade sortByDropDown;

    public boolean isProductInList(String productName){
        waitFor(listOfProductNames.get(0));
        for (WebElementFacade element:listOfProductNames){
            if (element.getText().equalsIgnoreCase(productName)){
                element.click();
                return true;
            }
        }return false;
    }
    public void selectPriceFromDropDown(){
        sortByDropDown.selectByIndex(6);
    }

    public boolean priceIsAscending(){
        int firstPrice =getIntFromPrice(listOfProductPrices.get(0).getText());
        int lastPrice =getIntFromPrice(listOfProductPrices.get(listOfProductPrices.size() - 1).getText());

        return firstPrice <= lastPrice;
    }

}
