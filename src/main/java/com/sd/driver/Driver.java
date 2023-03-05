package com.sd.driver;

import com.sd.config.Factory.ConfigFactory;
import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.DriverFactory;
import com.sd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

public class Driver {
    //Web- Local,SeleniumGrid,Selenoid,Browserstack
    //Mobile - local,Browserstack
    public static void initDriverWeb() {
        WebDriverData driverData = WebDriverData.builder().browserTypes(ConfigFactory.getConfig().browser())
                                                    .browserRemoteTypeMode(ConfigFactory.getConfig().browserRemoteMode())
                                                    .runModeBrowserType(ConfigFactory.getConfig().browserRunMode()).build();
        WebDriver driver = DriverFactory.getDriverForWeb(ConfigFactory.getConfig().browserRunMode()).getDriver(driverData);
        driver.quit();
    }

    public static void initDriverMobile() {
        MobileDriverData driverData = MobileDriverData.builder().mobilePlatformType(MobilePlatformType.ANDROID)
                                                    .mobilerRemoteTypeMode(ConfigFactory.getConfig().mobileRemoteMode()).build();
        WebDriver driver = DriverFactory.getDriverForMobile(ConfigFactory.getConfig().mobileRunMode()).getDriver(driverData);
    }

    public static void quitDriver() {

    }
}
