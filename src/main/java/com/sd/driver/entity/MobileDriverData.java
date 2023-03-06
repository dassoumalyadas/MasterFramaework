package com.sd.driver.entity;

import com.sd.enums.MobilePlatformType;
import com.sd.enums.MobilerRemoteTypeMode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobilerRemoteTypeMode mobilerRemoteTypeMode;
}
