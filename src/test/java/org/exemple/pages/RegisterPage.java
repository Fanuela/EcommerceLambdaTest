package org.exemple.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(id = "input-firstname")
    private WebElementFacade firstNameField;
    @FindBy(id = "input-lastname")
    private WebElementFacade lastNameField;
    @FindBy(id = "input-email")
    private WebElementFacade emailField;
    @FindBy(id = "input-telephone")
    private WebElementFacade telephoneField;
    @FindBy(id = "input-password")
    private WebElementFacade passwordField;
    @FindBy(id = "input-confirm")
    private WebElementFacade confirmPasswordField;
    @FindBy(id = "input-newsletter-no")
    private WebElementFacade noNewsletterButton;
    @FindBy(css = "div.custom-control.custom-checkbox")
    private WebElementFacade privacyPolicyBox;
    @FindBy(css = "input.btn")
    private WebElementFacade continueButton;
    @FindBy(css = ".page-title")
    private WebElementFacade successRegisterMessage;
    @FindBy(css = ".alert-dismissible")
    private WebElementFacade alreadyUsedAccountMessage;

    public void setFirstNameField(String firstName){
        typeInto(firstNameField,firstName);
    }
    public void setLastNameField(String lastName){
        typeInto(lastNameField,lastName);
    }
    public void setEmailField(String email){
        typeInto(emailField,email);
    }
    public void setTelephoneField(String telephone){
        typeInto(telephoneField,telephone);
    }
    public void setPasswordField(String password){
        typeInto(passwordField,password);
    }
    public void setConfirmPasswordField(String confirmPassword){
        typeInto(confirmPasswordField,confirmPassword);
    }
    public void clickOnNoNewsletterButton(){
        clickOn(noNewsletterButton);
    }
    public void clickOnPrivacyPolicyBox(){
        clickOn(privacyPolicyBox);
    }
    public void clickOnContinueButton(){
        clickOn(continueButton);
    }
    public boolean isSuccessRegisterMessage(String text){
        return successRegisterMessage.containsOnlyText(text);
    }
    public String accountIsAlreadyUsedMessage(){
        return alreadyUsedAccountMessage.getText();
    }
}
