package org.exemple.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ForgottenPasswordSteps extends BaseSteps{

    @Step
    public void clickOnForgottenPasswordLink(){
        loginPage.clickOnForgottenPasswordLink();
    }
    @Step
    public void confirmEmail(){
        accountForgottenPage.clickOnConfirmButton();
    }
    @Step
    public void verifyConfirmationEmail(){
        Assert.assertEquals("An email with a confirmation link has been sent your email address.",accountForgottenPage.emailWasSend());
    }
}
