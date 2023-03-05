package com.sd.driver.entity;

import com.sd.enums.MobilePlatformType;
import com.sd.enums.MobilerRemoteTypeMode;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobilerRemoteTypeMode mobilerRemoteTypeMode;
}
