package com.gapstars.dumiduh;

import com.gapstars.dumiduh.function.DropDownPageFunctions;
import com.gapstars.dumiduh.function.NotificationPageFunctions;
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
import static com.gapstars.dumiduh.constants.Constants.NOTIFICATION_PAGE_URL;

public class NotificationMessageTest {
    private static ChromeDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(NOTIFICATION_PAGE_URL);
    }

    @Test
    public static void notificationTest() {
        NotificationPageFunctions notificationPageFunctions = new NotificationPageFunctions(driver);
        TestData testData = JSONUtil.readTestData("005");

        notificationPageFunctions.displayTheNotification();

        //Asserts two aspects of the dynamic notification.
        Assert.assertTrue(notificationPageFunctions.readTheDisplayedNotification().length() > testData.getIntValue(), "The expected notification was not found.");
        Assert.assertTrue(notificationPageFunctions.readTheDisplayedNotification().contains( testData.getStringValue()), "The expected notification was not found.");
    }

    @AfterClass
    public static void cleanUp() {
        driver.quit();
    }
}
