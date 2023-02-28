package com.sd.tests;

import com.sd.config.Factory.ConfigFactory;
import org.testng.annotations.Test;
public class DemoTest {
    @Test
    public void testLogin(){
        //Singleton pattern.
        System.out.println(ConfigFactory.getConfig().browser());
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();*/
    }
}
