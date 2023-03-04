package com.sd.driver.factory;

import com.sd.driver.entity.DriverData;
import com.sd.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.sd.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.sd.driver.factory.web.local.LocalDriverFactory;
import com.sd.driver.factory.web.remote.RemoteDriverFactory;
import com.sd.enums.RunModeBrowserType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getDriverForWeb(DriverData driverData) {
        if (driverData.getRunModeBrowserType() == RunModeBrowserType.LOCAL) {
            return LocalDriverFactory.getDriver(driverData.getBrowserTypes());
        } else {
            return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteTypeMode(), driverData.getBrowserTypes());
        }
    }

    public static WebDriver getDriverForMobile(DriverData driverData) {
        if (driverData.getRunModeBrowserType() == RunModeBrowserType.LOCAL) {
            return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
        } else {
            return RemoteMobileDriverFactory.getDriver(driverData.getMobilerRemoteTypeMode(), driverData.getMobilePlatformType());
        }
    }
}
