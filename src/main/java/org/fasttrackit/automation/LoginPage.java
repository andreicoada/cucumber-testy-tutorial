package org.fasttrackit.automation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(name = "password")
    public WebElement passField;
    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    public void login (String email, String pass) {
        emailField.sendKeys(email);
        passField.sendKeys(pass);
        loginBtn.click();
    }


}
