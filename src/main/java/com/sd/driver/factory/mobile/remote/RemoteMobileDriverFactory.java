package com.sd.driver.factory.mobile.remote;

import com.sd.driver.web.remote.BrowserStackFactory;
import com.sd.driver.web.remote.SelenideFactory;
import com.sd.driver.web.remote.SeleniumGridFactory;
import com.sd.enums.BrowserRemoteTypeMode;
import com.sd.enums.BrowserTypes;
import com.sd.enums.MobilePlatformType;
import com.sd.enums.MobilerRemoteTypeMode;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory() {
    }

    /******Functional Interface Implementation******/
    private static final Map<MobilerRemoteTypeMode, Function<MobilePlatformType, WebDriver>> MAP = new EnumMap<>(MobilerRemoteTypeMode.class);

    static {
        MAP.put(MobilerRemoteTypeMode.SAUCE_LABS, SeleniumGridFactory::getDriver);
        MAP.put(MobilerRemoteTypeMode.BROWSER_STACK, SelenideFactory::getDriver);
    }

    public static WebDriver getDriver(MobilerRemoteTypeMode mobilerRemoteTypeMode,MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilerRemoteTypeMode).apply(mobilePlatformType);
    }
}
