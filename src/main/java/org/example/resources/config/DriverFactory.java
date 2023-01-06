package org.example.resources.config;

import com.codeborne.selenide.WebDriverRunner;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DriverFactory {
    WebDriver driver ;


    public void getAndroidDriver() throws MalformedURLException {
        AppiumCapabilities cap = new AppiumCapabilities();
        DesiredCapabilities capabilities = cap.returnCapabilities("chrome","Pixel3", "11");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        WebDriverRunner.setWebDriver(driver);

    }


    public void getChromeDriver() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);

    }

    public void getAndroidDriverPwa() throws IOException, InterruptedException {

      /*  HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.pinterest.com/manifest.json")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject manifest = JsonParser.parseString(response.body()).getAsJsonObject();
        String startUrl = manifest.get("start_url").getAsString();
        String themeColor = manifest.get("theme_color").getAsString();*/
        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability(MobileCapabilityType.APP, "com.android.chrome");
        //cap.setCapability(MobileCapabilityType., "com.google.android.apps.chrome.Main");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("deviceName", "Pixel_3");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("browserName", "chrome");
        //ChromeOptions co = new ChromeOptions();
        //co.setCapability("androidPackage", "com.android.chrome");
        //cap.setCapability(AndroidMobileCapabilityType.CHROME_OPTIONS, co);

        //cap.setCapability("appActivity" , "com.google.android.apps.chrome.Main");
        //cap.setCapability("appPackage" , "com.android.chrome");
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-first-run-ui");
        cap.setCapability(ChromeOptions.CAPABILITY, options);*/
        //Configuration.remote = "http://127.0.0.1:4723/wd/hub";
        //Configuration.browserCapabilities = cap;
        //cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        WebDriverRunner.setWebDriver(driver);

        HashMap<String, String> pwaParams = new HashMap<>();
        pwaParams.put("displayName", "Pinterest");
        //driver.executeScript("mobile:pwa:start",pwaParams);
        Thread.sleep(5000);

    }


}
