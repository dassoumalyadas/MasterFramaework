package com.sd.utils;

import com.sd.driver.manager.DriverThreadManager;
import org.openqa.selenium.By;

public class PageActionsHelper {

    private PageActionsHelper(){}

    public static void waitAndClick(By by){
        DriverThreadManager.getDriver().findElement(by).click();
    }
    public static void waitAndSendKeys(By by,String text){
        DriverThreadManager.getDriver().findElement(by).sendKeys(text);
    }
}
