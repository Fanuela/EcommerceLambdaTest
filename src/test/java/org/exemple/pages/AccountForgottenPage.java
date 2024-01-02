package org.exemple.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountForgottenPage extends BasePage{
    @FindBy(css = ".float-right .btn")
    private WebElementFacade confirmEmailButton;
    @FindBy(css = ".alert-dismissible")
    private WebElementFacade successEmailSent;

    public void clickOnConfirmButton(){
        clickOn(confirmEmailButton);
    }
    public String emailWasSend(){
        return successEmailSent.getText();
    }

}
