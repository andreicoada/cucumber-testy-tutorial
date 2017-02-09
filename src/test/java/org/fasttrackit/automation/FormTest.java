package org.fasttrackit.automation;

import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;

import org.testng.annotations.Test;

public class FormTest extends TestBase{

    private LoginView loginView = new LoginView();

    @Test
    public void selectCheckbox() {
        openLoginPage();

        loginView.login("eu@fast.com", "eu.pass");

        WebLocator stopProcessCheckbox = new WebLocator().setElPath("/html/body/form[1]/div[3]/label/input");
        WebLocator stopProcessCheckbox2 = new WebLocator().setElPath("/html/body/form[1]/div[4]/label/input");
        stopProcessCheckbox.click();

        Utils.sleep(2000);

        WebLocator stopProcessLabel = new WebLocator().setText("Stop the process?", SearchType.TRIM);
        WebLocator widthEnterLabel = new WebLocator().setText("Label with Enter.", SearchType.TRIM, SearchType.CHILD_NODE);
        stopProcessLabel.click();
        widthEnterLabel.click();

        Utils.sleep(2000);
        stopProcessLabel.click();
        widthEnterLabel.click();

        Utils.sleep(2000);
        stopProcessLabel.click();
        widthEnterLabel.click();

    }


}
