package org.fasttrackit.automation;


import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangePasswordTest extends TestBase {

    private LoginPage loginPage;
    private ChangePasswordPage changePasswordPage;

    public ChangePasswordTest (){

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        changePasswordPage = PageFactory.initElements(driver,ChangePasswordPage.class);
    }



    @Test
    public void changePasswordWithInvalidCurrentPassword() {
        openLoginPage();

        loginPage.login("eu@fast.com", "eu.pass");
        WebElement preferencesBtn = driver.findElement(By.xpath("//button[@data-target='#preferences-win']"));
        preferencesBtn.click();

        Utils.sleep(2000);

        changePasswordPage.update("eu.pass", "acces", "acces");

//        WebElement currentPasswordField = driver.findElement(By.name("password"));
//        WebElement newPasswordField = driver.findElement(By.name("newPassword"));
//        WebElement repeatPasswordField = driver.findElement(By.name("newPasswordRepeat"));
//
//        currentPasswordField.sendKeys("wrong.pass");
//        newPasswordField.sendKeys("new.pass");
//        repeatPasswordField.sendKeys("new.pass");
        }


    @Test
    public void changePasswordWithValidPassword() {
        openLoginPage();

        loginPage.login("eu@fast.com", "eu.pass");
        WebElement preferencesBtn = driver.findElement(By.xpath("//button[@data-target='#preferences-win']"));
        preferencesBtn.click();

        Utils.sleep(2000);

        changePasswordPage.update("eu.pass", "andrei", "andrei");
        preferencesBtn.click();
    }


        public void changePasswordWithInvalidRepeatPassword() {
            openLoginPage();

            loginPage.login("eu@fast.com", "eu.pass");
            WebElement preferencesBtn = driver.findElement(By.xpath("//button[@data-target='#preferences-win']"));
            preferencesBtn.click();
            Utils.sleep(1000);

            changePasswordPage.update("eu.pass", "new1.pass", "new2.pass");

            assertThat(changePasswordPage.getStatusMessage(), is("Password does not match the confirm password"));
    }

}






