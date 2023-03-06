package com.sd.driver;

import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.DriverFactory;
import com.sd.driver.manager.DriverThreadManager;
import com.sd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.sd.config.Factory.ConfigFactory.getConfig;

public class Driver {
    private Driver(){}
    private static WebDriver driver;

    //Web- Local,SeleniumGrid,Selenoid,Browserstack
    //Mobile - local,Browserstack
    public static void initDriverWeb() {
        WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
        driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
        DriverThreadManager.setDriver(driver);

    }

    public static void initDriverMobile() {
        MobileDriverData driverData = new MobileDriverData(MobilePlatformType.ANDROID, getConfig().mobileRemoteMode());
        driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(driverData);
        DriverThreadManager.setDriver(driver);
    }

    public static void quitDriver() {
        driver.quit();
        DriverThreadManager.unload();
    }
}
