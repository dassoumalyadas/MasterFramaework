package com.sd.driver.factory.web.remote;

import com.sd.driver.manager.web.remote.Selenide.SelenideChromeManager;
import com.sd.driver.manager.web.remote.Selenide.SelenideFirefoxManager;
import com.sd.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {
    private BrowserStackFactory(){}
    public static WebDriver getDriver(BrowserTypes browserTypes) {
        return browserTypes == BrowserTypes.CHROME ? SelenideChromeManager.getDriver() :
                SelenideFirefoxManager.getDriver();
    }
}
