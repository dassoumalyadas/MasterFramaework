package com.sd.driver.entity;

import com.sd.enums.BrowserRemoteTypeMode;
import com.sd.enums.BrowserTypes;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
    private BrowserTypes browserTypes;
    private BrowserRemoteTypeMode browserRemoteTypeMode;
}
