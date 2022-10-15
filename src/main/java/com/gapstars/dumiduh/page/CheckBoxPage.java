package com.gapstars.dumiduh.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPage extends PageBase {
    private ChromeDriver driver;
    private String chkCheckBoxGeneric = "//input[@type='checkbox'][X]";
    private String chkCheckBoxCheckedAppend = "[@checked]";

    public CheckBoxPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void checkCheckBoxValue(String value) {
        driver.findElement(By.xpath(chkCheckBoxGeneric.replace("X", value))).click();
    }

    public boolean isTheGivenCheckBoxChecked(String value) {
        try {
            driver.findElement(By.xpath(chkCheckBoxGeneric.replace("X", value) + chkCheckBoxCheckedAppend));
            return true;
        } catch (WebDriverException e) {
            return false;
        }
    }

}
