package com.sd.driver.manager;

import com.sd.config.ConfigFactory;
import com.sd.enums.BrowserRemoteTypeMode;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}
    public static WebDriver getDriver(){
        BrowserRemoteTypeMode browserRemoteTypeMode=ConfigFactory.getConfig().browserRemoteMode();
        if(browserRemoteTypeMode==BrowserRemoteTypeMode.SELENIDE){

        } else if (browserRemoteTypeMode==BrowserRemoteTypeMode.BROWSER_STACK) {

        }else {

        }
        return null;
    }
}
