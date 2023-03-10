package com.sd.driver.factory.web.remote;

import com.sd.driver.manager.web.remote.seleniumGrid.SeleniumGridChromeManager;
import com.sd.driver.manager.web.remote.seleniumGrid.SeleniumGridFirefoxManager;
import com.sd.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

public class SeleniumGridFactory {
    private SeleniumGridFactory() {
    }

    public static WebDriver getDriver(BrowserTypes browserTypes) {
        return browserTypes == BrowserTypes.CHROME ? SeleniumGridChromeManager.getDriver() :
                SeleniumGridFirefoxManager.getDriver();
    }
}
