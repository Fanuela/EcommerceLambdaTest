package org.exemple.steps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {


    @Step
    public void clickOnRegisterButton(){
        loginPage.clickOnRegisterButton();
    }
    @Step
    public void typeFirstName(String firstName){
        registerPage.setFirstNameField(firstName);
    }
    @Step
    public void typeLastName(String lastName){
        registerPage.setLastNameField(lastName);
    }
    @Step
    public void typeEmail(String email){
        registerPage.setEmailField(email);
    }
    @Step
    public void typeTelephone(String telephone){
        registerPage.setTelephoneField(telephone);
    }
    @Step
    public void typePassword(String password){
        registerPage.setPasswordField(password);
    }
    @Step
    public void typeConfirmPassword(String confirmPassword){
        registerPage.setConfirmPasswordField(confirmPassword);
    }
    @Step
    public void clickOnNoNewsletterButton(){
        registerPage.clickOnNoNewsletterButton();
    }
    @Step
    public void clickOnPrivacyPolicyBox(){
        registerPage.clickOnPrivacyPolicyBox();
    }
    @Step
    public void clickOnContinueButton(){
        registerPage.clickOnContinueButton();
    }
    @Step
    public void userIsRegisterWithSuccess(String message){
        Assert.assertTrue(registerPage.isSuccessRegisterMessage(message));
    }
}
