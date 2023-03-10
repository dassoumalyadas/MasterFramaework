package com.sd.driver.manager.web.remote.seleniumGrid;

import com.sd.config.Factory.ConfigFactory;
import com.sd.enums.BrowserTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridFirefoxManager {

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(BrowserTypes.FIREFOX));
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
    }
}
