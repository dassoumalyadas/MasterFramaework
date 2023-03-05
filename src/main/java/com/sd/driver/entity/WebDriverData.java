package com.sd.driver.entity;

import com.sd.enums.BrowserRemoteTypeMode;
import com.sd.enums.BrowserTypes;
import com.sd.enums.RunModeBrowserType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WebDriverData {
    private BrowserTypes browserTypes;
    private BrowserRemoteTypeMode browserRemoteTypeMode;
    private RunModeBrowserType runModeBrowserType;
}
