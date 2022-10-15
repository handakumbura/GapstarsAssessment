package com.gapstars.dumiduh.function;

import com.gapstars.dumiduh.page.DropDownPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPageFunctions {
    private DropDownPage dropDownPage;
    private ChromeDriver driver;

    public DropDownPageFunctions(ChromeDriver driver) {
        this.driver = driver;
        dropDownPage = new DropDownPage(driver);
    }

    public void selectValueFromDropDown(String value) {
        dropDownPage.selectValueFromDropDown(value);
    }

    public boolean isTheGivenValueSelected(String value) {
        return dropDownPage.isTheGivenValueSelected(value);
    }


}
