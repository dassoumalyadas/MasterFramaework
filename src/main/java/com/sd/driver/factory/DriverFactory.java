package com.sd.driver.factory;

import com.sd.driver.*;
import com.sd.enums.RunModeBrowserType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {
    private DriverFactory() {
    }

    private static final Map<RunModeBrowserType, Supplier<IWebDriver>> WEB=new EnumMap<RunModeBrowserType, Supplier<IWebDriver>>(RunModeBrowserType.class);
    private static final Map<RunModeBrowserType, Supplier<IMobileDriver>> MOBILE=new EnumMap<RunModeBrowserType, Supplier<IMobileDriver>>(RunModeBrowserType.class);

    static {
        WEB.put(RunModeBrowserType.LOCAL,LocalWebDriverImpl::new);
        WEB.put(RunModeBrowserType.REMOTE,RemoteWebDriverImpl::new);
        MOBILE.put(RunModeBrowserType.LOCAL,LocalMobileDriverImpl::new);
        MOBILE.put(RunModeBrowserType.REMOTE,RemoteMobileDriverImpl::new);
    }

    public static IWebDriver getDriverForWeb(RunModeBrowserType runModeBrowserType) {
        return WEB.get(runModeBrowserType).get();
    }

    public static IMobileDriver getDriverForMobile(RunModeBrowserType runModeBrowserType) {
        return MOBILE.get(runModeBrowserType).get();
    }
}

