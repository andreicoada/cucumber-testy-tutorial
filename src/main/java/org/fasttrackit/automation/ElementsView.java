package org.fasttrackit.automation;


import com.sdl.selenium.extjs6.form.CheckBox;
import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;

public class ElementsView {

    WebLocator stopProcessLabel = new WebLocator().setText("Stop the process?", SearchType.TRIM);
    WebLocator widthEnterLabel = new WebLocator().setText("Label with Enter.", SearchType.TRIM, SearchType.CHILD_NODE);
    CheckBox stopProcessCheckbox2 = new CheckBox().setElPath("/html/body/form[1]/div[4]/label/input");
    CheckBox stopProcessCheckbox = new CheckBox().setElPath("/html/body/form[1]/div[3]/label/input");
}
