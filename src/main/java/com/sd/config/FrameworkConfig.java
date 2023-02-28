package com.sd.config;

import com.sd.config.converters.StringToBrowserTypeConverter;
import com.sd.config.converters.StringToURLConverter;
import com.sd.enums.BrowserRemoteTypeMode;
import com.sd.enums.BrowserTypes;
import com.sd.enums.RunModeBrowserType;
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

    @Key("browserRemoteMode")
    BrowserRemoteTypeMode browserRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();


    @ConverterClass(StringToURLConverter.class)
    URL selenideURL();
}
