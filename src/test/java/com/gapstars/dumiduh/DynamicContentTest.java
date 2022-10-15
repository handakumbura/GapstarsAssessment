package com.gapstars.dumiduh;


import com.gapstars.dumiduh.function.DynamicContentPageFunctions;
import com.gapstars.dumiduh.models.TestData;
import com.gapstars.dumiduh.page.DynamicContentPage;
import com.gapstars.dumiduh.utils.JSONUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.gapstars.dumiduh.constants.Constants.DYNAMIC_CONTENT_URL;

public class DynamicContentTest {
    private static ChromeDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(DYNAMIC_CONTENT_URL);
    }

    @Test
    public static void dynamicContentTest() {
        DynamicContentPageFunctions dynamicContentPage = new DynamicContentPageFunctions(driver);
        TestData testData = JSONUtil.readTestData("003");
        Assert.assertTrue(dynamicContentPage.isTheDynamicContentAvailable(), "The dynamic content was not available");
        Assert.assertEquals(dynamicContentPage.numberOfRowsContentDisplayed(), testData.getIntValue(), "The number of rows displayed is not as expected.");
    }

    @AfterClass
    public static void cleanUp() {
        driver.quit();
    }
}
