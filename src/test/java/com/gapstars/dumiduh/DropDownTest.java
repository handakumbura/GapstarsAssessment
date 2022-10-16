package com.gapstars.dumiduh;

import com.gapstars.dumiduh.function.DropDownPageFunctions;
import com.gapstars.dumiduh.models.TestData;
import com.gapstars.dumiduh.utils.JSONUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.gapstars.dumiduh.constants.Constants.DROPDOWN_PAGE_URL;

public class DropDownTest {
private static ChromeDriver driver;
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(DROPDOWN_PAGE_URL);
    }

    @Test
    public static void dropDownTest() {
        DropDownPageFunctions dropDownPageFunctions = new DropDownPageFunctions(driver);
        TestData testData = JSONUtil.readTestData("002");

        dropDownPageFunctions.selectValueFromDropDown(testData.getStringValue());

        //Asserts to see if the dropdown selection has been set.
        Assert.assertTrue(dropDownPageFunctions.isTheGivenValueSelected(testData.getStringValue()), "The given value was not set as the dropdown selection.");
    }

    @AfterClass
    public static void cleanUp(){
        driver.quit();
    }
}
