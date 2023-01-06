package org.example.resources.config;

import com.codeborne.selenide.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;

public class BrowserConfig {

    public void setBrowserSettings(String browser){

        Configuration.browser = browser;
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;

    }

    public void setBrowserMobileSettings(){
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "450x2000";
        Configuration.headless = true;
    }

    public void setBrowserMobileAppiumSettings( DesiredCapabilities caps){
        //Configuration.browser = browser;
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.remote = "http://127.0.0.1:4723/wd/hub";
        Configuration.browserCapabilities = caps;

    }

    public void quitDriver(){
        closeWebDriver();
    }


}

