package org.exemple.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(id = "input-email")
    private WebElementFacade emailField;
    @FindBy(id = "input-password")
    private WebElementFacade passwordField;
    @FindBy(css = "input.btn")
    private WebElementFacade loginButton;
    @FindBy(css = "a.list-group-item:nth-child(2)")
    private WebElementFacade registerButton;
    @FindBy(css = "div.card:nth-child(1) > h2:nth-child(1)")
    private WebElementFacade successLoggedMessage;
    @FindBy(css = ".alert-dismissible")
    private WebElementFacade requiredPasswordElement;


    public void setEmailField(String email){
        typeInto(emailField,email);
    }
    public void setPasswordField(String password){
        typeInto(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }
    public boolean isSuccessLoggedMessage(String message){
        return successLoggedMessage.containsOnlyText(message);
    }
    public String getRequiredPasswordText(){
        return requiredPasswordElement.getText();
    }
}
