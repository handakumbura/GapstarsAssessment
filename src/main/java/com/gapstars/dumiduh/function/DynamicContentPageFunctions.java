package com.gapstars.dumiduh.function;

import com.gapstars.dumiduh.page.DynamicContentPage;
import com.gapstars.dumiduh.page.NotificationPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContentPageFunctions {
    private DynamicContentPage dynamicContentPage;
    private ChromeDriver driver;

    public DynamicContentPageFunctions(ChromeDriver driver) {
        this.driver = driver;
        dynamicContentPage = new DynamicContentPage(driver);
    }

    public boolean isTheDynamicContentAvailable() {
        return dynamicContentPage.isTheDynamicContentAvailable();
    }

    public int numberOfRowsContentDisplayed() {
        return dynamicContentPage.numberOfRowsContentDisplayed();
    }


}
