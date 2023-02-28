package com.sd.driver.web.remote;

import com.sd.driver.manager.web.remote.Selenide.SelenideChromeManager;
import com.sd.driver.manager.web.remote.Selenide.SelenideFirefoxManager;
import com.sd.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

public final class SelenideFactory {

    private SelenideFactory(){}

    public static WebDriver getDriver(BrowserTypes browserTypes) {
        return browserTypes == BrowserTypes.CHROME ? SelenideChromeManager.getDriver() :
                SelenideFirefoxManager.getDriver();
    }

}
