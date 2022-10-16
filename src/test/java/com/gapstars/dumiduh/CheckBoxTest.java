package com.gapstars.dumiduh;

import com.gapstars.dumiduh.function.CheckBoxPageFunctions;
import com.gapstars.dumiduh.models.TestData;
import com.gapstars.dumiduh.utils.JSONUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.gapstars.dumiduh.constants.Constants.CHECKBOX_PAGE_URL;

public class CheckBoxTest {
    private static ChromeDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(CHECKBOX_PAGE_URL);
    }

    @Test
    public static void checkBoxTest() {
        CheckBoxPageFunctions checkBoxPageFunctions = new CheckBoxPageFunctions(driver);
        TestData testData = JSONUtil.readTestData("001");

        checkBoxPageFunctions.checkCheckBoxValue(testData.getStringValue());

        //Asserts to see if the checkbox has been checked.
        Assert.assertTrue(checkBoxPageFunctions.isTheGivenCheckBoxChecked(testData.getStringValue()), "The given checkbox was not checked.");
    }

    @AfterClass
    public static void cleanUp() {
        driver.quit();
    }
}
