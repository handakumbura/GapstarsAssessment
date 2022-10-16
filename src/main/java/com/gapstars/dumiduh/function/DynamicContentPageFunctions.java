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

    /***
     * Checks to see if the dynamic content is available on the page.
     * @return Whether the content is available.
     */
    public boolean isTheDynamicContentAvailable() {
        return dynamicContentPage.isTheDynamicContentAvailable();
    }

    /***
     * Returns the number of rows of content available.
     * @return The number of rows available in the content.
     */
    public int numberOfRowsContentDisplayed() {
        return dynamicContentPage.numberOfRowsContentDisplayed();
    }


}
