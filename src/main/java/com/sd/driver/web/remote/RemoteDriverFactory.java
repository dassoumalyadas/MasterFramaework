package com.sd.driver.web.remote;

import com.sd.enums.BrowserRemoteTypeMode;
import com.sd.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {
    }

    /******Functional Interface Implementation******/
    private static final Map<BrowserRemoteTypeMode, Function<BrowserTypes, WebDriver>> MAP = new EnumMap<>(BrowserRemoteTypeMode.class);

    static {
        MAP.put(BrowserRemoteTypeMode.SELENIUM_GRID, SeleniumGridFactory::getDriver);
        MAP.put(BrowserRemoteTypeMode.SELENIDE, SelenideFactory::getDriver);
        MAP.put(BrowserRemoteTypeMode.BROWSER_STACK, BrowserStackFactory::getDriver);
    }

    public static WebDriver getDriver(BrowserRemoteTypeMode browserRemoteTypeMode, BrowserTypes browserTypes) {
        return MAP.get(browserRemoteTypeMode).apply(browserTypes);
    }
}
