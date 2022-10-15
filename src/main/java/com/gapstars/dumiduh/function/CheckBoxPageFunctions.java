package com.gapstars.dumiduh.function;

import com.gapstars.dumiduh.page.CheckBoxPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPageFunctions {
    private CheckBoxPage checkBoxPage;
    private ChromeDriver driver;

    public CheckBoxPageFunctions(ChromeDriver driver) {
        this.driver = driver;
        checkBoxPage = new CheckBoxPage(driver);
    }

    public void checkCheckBoxValue(String value) {
        checkBoxPage.checkCheckBoxValue(value);
    }

    public boolean isTheGivenCheckBoxChecked(String value) {
       return checkBoxPage.isTheGivenCheckBoxChecked(value);
    }

}
