package com.gapstars.dumiduh.function;

import com.gapstars.dumiduh.page.CheckBoxPage;
import com.gapstars.dumiduh.page.NotificationPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPageFunctions {
    private NotificationPage notificationPage;
    private ChromeDriver driver;

    public NotificationPageFunctions(ChromeDriver driver) {
        this.driver = driver;
        notificationPage = new NotificationPage(driver);
    }

    public void displayTheNotification() {
        notificationPage.clickClickHere();
    }

    public String readTheDisplayedNotification() {
        return notificationPage.readNotificationMessage();
    }


}
