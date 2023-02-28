package com.sd.driver.manager.web.remote.browserStack;

import com.sd.config.Factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackChromeManager {
    private  BrowserStackChromeManager(){}
    public static WebDriver getDriver(){
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("browserName","chrome");
        capabilities.setCapability("browserVersion","107.0");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver((CommandExecutor) BrowserStackConfigFactory.getConfig(), capabilities);
    }
}
