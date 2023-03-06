package com.sd.driver.manager;

import com.sd.enums.PlatformType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

import static com.sd.enums.PlatformType.MOBILE;
import static com.sd.enums.PlatformType.WEB;
import static java.lang.ThreadLocal.withInitial;

public final class DriverThreadManager {
    //Web--> Mobile
    //Web--> Mobile--> Web

    private DriverThreadManager() {
    }

    //List,Map --> WEB,WEBDRIVER_THREAD_LOCAL; MOBILE,MOBILE_DRIVER_THREAD_LOCAL
    //At a particular instance ,context --> WEB,MOBILE
    private static final ThreadLocal<WebDriver> WEBDRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> MOBILE_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<PlatformType> CONTEXT = withInitial(() -> WEB);
    private static final Map<PlatformType, ThreadLocal<WebDriver>> DRIVER_MAP = new EnumMap<PlatformType, ThreadLocal<WebDriver>>(PlatformType.class);

    public static WebDriver getDriver() {
        return CONTEXT.get() == WEB ? WEBDRIVER_THREAD_LOCAL.get() : MOBILE_DRIVER_THREAD_LOCAL.get();
    }

    private static boolean isMobileDriver(WebDriver driver) {
        return driver instanceof AndroidDriver || driver instanceof IOSDriver;
    }

    public static void setDriver(WebDriver driver) {
        if (isMobileDriver(driver)) {
            MOBILE_DRIVER_THREAD_LOCAL.set(driver);
            CONTEXT.set(MOBILE);

        } else {
            WEBDRIVER_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(WEB, WEBDRIVER_THREAD_LOCAL);
            CONTEXT.set(WEB);
        }
    }

    public static void unload() {
        WEBDRIVER_THREAD_LOCAL.remove();
        MOBILE_DRIVER_THREAD_LOCAL.remove();
        CONTEXT.remove();
    }
}
