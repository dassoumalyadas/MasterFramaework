package com.sd.driver;

import com.sd.config.ConfigFactory;
import com.sd.driver.manager.ChromeManager;
import com.sd.driver.manager.FirefoxManager;
import com.sd.enums.BrowserTypes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory(){}
    public static WebDriver getDriver(){
        WebDriver driver=null;
        if(ConfigFactory.getConfig().browser()== BrowserTypes.CHROME){
            driver= ChromeManager.getDriver();
        }else{
            WebDriverManager.firefoxdriver().setup();
            driver= FirefoxManager.getDriver();
        }
        return  driver;
    }
}
