package com.sd.config.converters;

import com.sd.enums.BrowserTypes;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserTypes> {

    @Override
    public BrowserTypes convert(Method method, String browserName) {
        Map<String,BrowserTypes>stringTOBrowserTypeMap=Map.of("CHROME",BrowserTypes.CHROME,"FIREFOX",BrowserTypes.FIREFOX);
        //If the mentioned browser is not present it will return the default Browser ,which is chrome.
        return stringTOBrowserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserTypes.CHROME);
    }
}
