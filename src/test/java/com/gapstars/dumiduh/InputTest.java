package com.gapstars.dumiduh;

import com.gapstars.dumiduh.function.DropDownPageFunctions;
import com.gapstars.dumiduh.function.InputPageFunctions;
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
import static com.gapstars.dumiduh.constants.Constants.INPUT_PAGE_URL;

public class InputTest {
private static ChromeDriver driver;
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(INPUT_PAGE_URL);
    }

    @Test
    public static void inputTest() {
        InputPageFunctions inputPageFunctions = new InputPageFunctions(driver);
        TestData testData = JSONUtil.readTestData("004");

        //Sets a numerical value.
        inputPageFunctions.setText(testData.getIntValue());
    }

    @AfterClass
    public static void cleanUp(){
        driver.quit();
    }
}
