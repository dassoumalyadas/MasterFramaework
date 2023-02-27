package com.sd.config.converters;

import com.sd.enums.BrowserRemoteTypeMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteTypeMode> {

    @Override
    public BrowserRemoteTypeMode convert(Method method, String remoteMode) {
        return BrowserRemoteTypeMode.valueOf(remoteMode.toUpperCase());
    }
}
