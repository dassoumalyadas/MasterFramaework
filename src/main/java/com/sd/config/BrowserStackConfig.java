package com.sd.config;

import com.sd.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:${user.dir}/src/test/java/resources/Browserstack.properties"})
public interface BrowserStackConfig extends Config {
    @Key("username")
    String username();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserstackURL();
}
