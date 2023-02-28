package com.sd.driver.manager.web.remote.Selenide;

import com.sd.config.Factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenideFirefoxManager {

    private SelenideFirefoxManager(){

    }

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("browserName","firefox");
        capabilities.setCapability("browserVersion","107.0");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenideURL(), capabilities);
    }
}
