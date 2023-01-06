package org.example.resources.config;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumCapabilities {



    public DesiredCapabilities returnCapabilities(String browserName, String deviceName, String deviceVersion){
        ChromeBrowserOptions options = new ChromeBrowserOptions();
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("deviceName", deviceName);
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", deviceVersion);
        cap.setCapability("browserName", browserName);
        cap.setCapability("autoGrantPermissions", "true");
        //cap.setCapability(ChromeOptions.CAPABILITY, options.getChromeOptionsWithHeadless());
        return cap;
    }

}
