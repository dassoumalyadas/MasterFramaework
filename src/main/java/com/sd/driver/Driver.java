package com.sd.driver;

import com.sd.config.Factory.ConfigFactory;
import com.sd.driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static void initDriver(){
        WebDriver driver= LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
    }

    public static void quitDriver(){

    }
}
