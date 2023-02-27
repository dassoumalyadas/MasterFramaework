package com.sd.config;

import com.sd.config.converters.StringToBrowserTypeConverter;
import com.sd.enums.BrowserTypes;
import org.aeonbits.owner.Config;

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
}
