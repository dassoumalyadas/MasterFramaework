package com.sd.config;

import com.sd.config.converters.StringToBrowserTypeConverter;
import com.sd.config.converters.StringToURLConverter;
import com.sd.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/java/resources/config.properties"
})
public interface FrameworkConfig extends Config {
    @Config.DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserTypes browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("runModeMobile")
    RunModeBrowserType mobileRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteTypeMode browserRemoteMode();


    @Key("mobile_remote_mode")
    MobilerRemoteTypeMode mobileRemoteMode();


    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();


    @ConverterClass(StringToURLConverter.class)
    URL selenideURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();
}
