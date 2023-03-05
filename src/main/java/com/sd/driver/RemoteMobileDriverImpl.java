package com.sd.driver;

import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobilerRemoteTypeMode(), driverData.getMobilePlatformType());
    }
}
