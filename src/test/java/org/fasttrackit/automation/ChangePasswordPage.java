package org.fasttrackit.automation;


import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ChangePasswordPage {
    @FindBy(name = "password")
    private  WebElement currentPasswordField;
    @FindBy(name = "newPassword")
    private WebElement newPasswordField;
    @FindBy(name = "newPasswordRepeat")
    private WebElement repeatPasswordField;
    @FindBy(xpath = "//*[@id='preferences-win']//button[normalize-space(text())='Save']")
    private WebElement saveBtn;
    @FindBy(className = "status-msg")
private WebElement statusMsg;

public  String getStatusMessage() {
        String msg = statusMsg.getText();
        System.out.println();
        return msg;
        }


public void update(String currentPass, String newPass, String repeatNewPass) {
        currentPasswordField.sendKeys(currentPass);
        newPasswordField.sendKeys(newPass);
        repeatPasswordField.sendKeys(repeatNewPass);
        saveBtn.click();
        }


        }