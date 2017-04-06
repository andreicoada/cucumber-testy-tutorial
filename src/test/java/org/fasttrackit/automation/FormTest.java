package org.fasttrackit.automation;

import com.sdl.selenium.bootstrap.form.DatePicker;
import com.sdl.selenium.bootstrap.form.MultiSelect;
import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;

import org.testng.annotations.Test;

import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FormTest extends TestBase{

    private LoginView loginView = new LoginView();

    private ElementsView elementsView = new ElementsView();



    @Test
    public void selectCheckbox() {
        openLoginPage();

        loginView.login("eu@fast.com", "eu.pass");

        elementsView.stopProcessCheckbox.click();
      //  elementsView.stopProcessCheckbox2.click();


        assertThat(elementsView.stopProcessCheckbox.isSelected(), is(true));
        assertThat( elementsView.stopProcessCheckbox2.isSelected(), is(true));
    }


    @Test
    public void dropDownComponentTest() {
        openLoginPage();
        loginView.login("eu@fast.com","eu.pass");

        DropDown dropDown  = new DropDown();
        dropDown.select("Manual");

        Utils.sleep(2000);

        dropDown.select("Auto");

        MultiSelect source = new MultiSelect().setClasses("multiselect");
        source.select(" Tomatoes", " Mozzarella");

        DatePicker datePicker = new DatePicker();
       // datePicker.setDate("9","Apr", "2017" );
        datePicker.select("11/03/2016", "dd/MM/yyyy", Locale.ENGLISH);

    }

}
