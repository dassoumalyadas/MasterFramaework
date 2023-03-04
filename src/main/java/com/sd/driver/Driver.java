package com.sd.driver;

import com.sd.config.Factory.ConfigFactory;
import com.sd.driver.entity.DriverData;
import com.sd.driver.factory.DriverFactory;
import com.sd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

public class Driver {
    //Web- Local,SeleniumGrid,Selenoid,Browserstack
    //Mobile - local,Browserstack
    public static void initDriverWeb() {
        DriverData driverData = DriverData.builder().browserTypes(ConfigFactory.getConfig().browser())
                                                    .browserRemoteTypeMode(ConfigFactory.getConfig().browserRemoteMode())
                                                    .runModeBrowserType(ConfigFactory.getConfig().browserRunMode()).build();
        WebDriver driver = DriverFactory.getDriverForWeb(driverData);
        driver.quit();
    }

    public static void initDriverMobile() {
        DriverData driverData = DriverData.builder().mobilePlatformType(MobilePlatformType.ANDROID)
                                                    .mobilerRemoteTypeMode(ConfigFactory.getConfig().mobileRemoteMode())
                                                    .runModeBrowserType(ConfigFactory.getConfig().mobileRunMode()).build();
        WebDriver driver = DriverFactory.getDriverForMobile(driverData);
    }

    public static void quitDriver() {

    }
}
