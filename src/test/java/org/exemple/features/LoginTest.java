package org.exemple.features;
import org.exemple.utils.Constants;
import org.junit.Test;


public class LoginTest extends BaseTest {

    @Test
    public void validLoginTestTest() {
        loginSteps.clickOnMyAccountButton();
        loginSteps.typeEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickOnLoginButton();
        loginSteps.userIsLoggedMessage(Constants.USER_LOGGED_MESSAGE);

    }

    @Test
    public void invalidLoginTestTest() {
        loginSteps.clickOnMyAccountButton();
        loginSteps.typeEmail(Constants.INVALID_USER_EMAIL);
        loginSteps.typePassword(Constants.INVALID_USER_PASSWORD);
        loginSteps.clickOnLoginButton();
        loginSteps.checkPasswordFieldRequired();
    }

    @Test
    public void verifyPasswordRequiredFieldTest() {
        loginSteps.clickOnMyAccountButton();
        loginSteps.typeEmail(Constants.USER_EMAIL);
        loginSteps.clickOnLoginButton();
        loginSteps.checkPasswordFieldRequired();
    }

    @Test
    public void verifyEmailRequiredFieldTest() {
        loginSteps.clickOnMyAccountButton();
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickOnLoginButton();
        loginSteps.checkPasswordFieldRequired();
    }
    @Test
    public void forgottenPasswordTEst(){
        loginSteps.clickOnMyAccountButton();
        forgottenPasswordSteps.clickOnForgottenPasswordLink();
        loginSteps.typeEmail(Constants.USER_EMAIL);
        forgottenPasswordSteps.confirmEmail();
        forgottenPasswordSteps.verifyConfirmationEmail();

    }
}
