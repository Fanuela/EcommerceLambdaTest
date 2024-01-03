package org.exemple.features;
import org.junit.Test;


public class RegisterTest extends BaseTest {

    @Test
    public void registerWithValidDataTest(){

        loginSteps.clickOnMyAccountButton();
        registerSteps.clickOnRegisterButton();
        registerSteps.typeFirstName("Schmidt");
        registerSteps.typeLastName("Martin");
        registerSteps.typeEmail("martinn.schmiddttt@yahoo.com");
        registerSteps.typeTelephone("+491578426578");
        registerSteps.typePassword("+iv:8xu4J,'i.5Q");
        registerSteps.typeConfirmPassword("+iv:8xu4J,'i.5Q");
        registerSteps.clickOnPrivacyPolicyBox();
        registerSteps.clickOnContinueButton();
        registerSteps.userIsRegisterWithSuccess("Your Account Has Been Created!");

    }

    @Test
    public void registerWithAlreadyUsedDataTest() {

        loginSteps.clickOnMyAccountButton();
        registerSteps.clickOnRegisterButton();
        registerSteps.typeFirstName("Schmidt");
        registerSteps.typeLastName("Martin");
        registerSteps.typeEmail("martin.schmiddttt@yahoo.com");
        registerSteps.typeTelephone("+491578426578");
        registerSteps.typePassword("+iv:8xu4J,'i.5Q");
        registerSteps.typeConfirmPassword("+iv:8xu4J,'i.5Q");
        registerSteps.clickOnPrivacyPolicyBox();
        registerSteps.clickOnContinueButton();
        registerSteps.accountIsAlreadyUsedMessage();


    }
}
