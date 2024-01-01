package org.exemple.steps;
import net.thucydides.core.annotations.Step;
import org.exemple.utils.Messages;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {


    @Step
    public void clickOnMyAccountButton(){
        homePage.clickOnMyAccountButton();
    }
    @Step
    public void typeEmail(String text){
        loginPage.setEmailField(text);
    }
    @Step
    public void typePassword(String text){
        loginPage.setPasswordField(text);
    }
    @Step
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }
    @Step
    public void userIsLoggedMessage(String message){
        Assert.assertTrue(loginPage.isSuccessLoggedMessage(message));
    }
    @Step
    public void doLogin(String email, String password){
        clickOnMyAccountButton();
        typeEmail(email);
        typePassword(password);
        clickOnLoginButton();

    }
    @Step
    public void checkPasswordFieldRequired(){
        Assert.assertEquals(Messages.REQUIRED_FIELD_MESSAGE,loginPage.getRequiredPasswordText());
    }

}
