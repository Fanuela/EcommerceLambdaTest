package org.exemple.features;
import org.exemple.utils.Constants;
import org.junit.Test;


public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentialTest(){
       loginSteps.clickOnMyAccountButton();
       loginSteps.typeEmail(Constants.USER_EMAIL);
       loginSteps.typePassword(Constants.USER_PASSWORD);
       loginSteps.clickOnLoginButton();
       loginSteps.userIsLoggedMessage(Constants.USER_LOGGED_MESSAGE);

    }
    @Test
    public void verifyPasswordRequiredFieldTest() {
        loginSteps.clickOnMyAccountButton();
        loginSteps.typeEmail(Constants.USER_EMAIL);
        loginSteps.clickOnLoginButton();
        loginSteps.checkPasswordFieldRequired();
    }
}
