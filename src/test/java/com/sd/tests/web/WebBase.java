package com.sd.tests.web;

import com.sd.driver.Driver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.sd.driver.Driver.loadURL;

public class WebBase {

    @BeforeSuite
    public void setUp() {
        Driver.initDriverWeb();
        loadURL();
    }

    @AfterSuite
    public void tearDown() {
        Driver.quitDriver();
    }
}
