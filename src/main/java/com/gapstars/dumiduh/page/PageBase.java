package com.gapstars.dumiduh.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

public class PageBase {

    public void waitForPredefinedDuration(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
