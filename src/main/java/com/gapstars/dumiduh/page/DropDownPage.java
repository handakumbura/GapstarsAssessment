package com.gapstars.dumiduh.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPage extends PageBase {
    private ChromeDriver driver;
    private By drpDropDown = By.xpath("//*[@id='dropdown']");
    private String optOptionGeneric = "//option[@value='X' and @selected='selected']";

    public DropDownPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void selectValueFromDropDown(String value) {
        driver.findElement(drpDropDown).sendKeys(value);
    }

    public boolean isTheGivenValueSelected(String value) {
        try {
            driver.findElement(By.xpath(optOptionGeneric.replace("X", value.split(" ")[1])));
            return true;
        } catch (WebDriverException e) {
            return false;
        }
    }
}
