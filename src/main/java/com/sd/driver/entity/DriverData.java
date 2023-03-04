package com.sd.driver.entity;

import com.sd.enums.*;
import lombok.Builder;
import lombok.Data;

//To create immutable class then builder pattern is best way.
@Builder
//To create getters and setters.
//To expose only getters we can use @Getters
@Data
public class DriverData {
    private BrowserTypes browserTypes;
    private BrowserRemoteTypeMode browserRemoteTypeMode;
    private MobilePlatformType mobilePlatformType;
    private RunModeBrowserType runModeBrowserType;
    private MobilerRemoteTypeMode mobilerRemoteTypeMode;
}
