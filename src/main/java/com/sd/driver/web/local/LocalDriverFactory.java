package com.sd.driver.web.local;

import com.sd.driver.manager.web.local.ChromeManager;
import com.sd.driver.manager.web.local.FirefoxManager;
import com.sd.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    /****EnumMap implementation****/
    private static final Map<BrowserTypes, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserTypes.class);

    static {
        MAP.put(BrowserTypes.CHROME, ChromeManager::getDriver);
        MAP.put(BrowserTypes.FIREFOX, FirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserTypes browserTypes) {
        return MAP.get(browserTypes).get();
    }

}
