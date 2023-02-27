package com.sd.driver.manager;

import com.sd.config.ConfigFactory;
import com.sd.enums.BrowserTypes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManager {
    private ChromeManager(){}

    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static boolean isBrowserChrome(){
        return ConfigFactory.getConfig().browser()== BrowserTypes.CHROME;
    }
}
