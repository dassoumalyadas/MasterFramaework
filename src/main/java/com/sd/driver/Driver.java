package com.sd.driver;

import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.DriverFactory;
import com.sd.driver.manager.DriverThreadManager;
import com.sd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.sd.config.Factory.ConfigFactory.getConfig;

public final class Driver {
    private Driver() {
    }

    //Web- Local,SeleniumGrid,Selenoid,Browserstack
    //Mobile - local,Browserstack
    public static void initDriverWeb() {
        if (Objects.isNull(DriverThreadManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
            DriverThreadManager.setDriver(driver);

        }
    }

    public static void loadURL(){
        DriverThreadManager.getDriver().get(getConfig().webUrl());
    }

    public static void initDriverMobile() {
        if (Objects.isNull(DriverThreadManager.getDriver())) {
            MobileDriverData driverData = new MobileDriverData(MobilePlatformType.ANDROID, getConfig().mobileRemoteMode());
            WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(driverData);
            DriverThreadManager.setDriver(driver);
        }
    }

    public static void quitDriver() {
        if (!Objects.isNull(DriverThreadManager.getDriver())) {
            DriverThreadManager.getDriver().close();
            DriverThreadManager.unload();
        }
    }
}
