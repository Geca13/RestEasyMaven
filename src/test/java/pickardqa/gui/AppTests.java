package pickardqa.gui;

import org.example.gui.steps.StarbucksSteps;
import org.example.resources.config.BrowserConfig;
import org.example.resources.config.DriverFactory;
import org.junit.jupiter.api.*;

import java.net.MalformedURLException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTests {


    private DriverFactory driverFactory = new DriverFactory();

    StarbucksSteps steps = new StarbucksSteps();

    BrowserConfig config = new BrowserConfig();

    @BeforeEach
    public void setup() throws MalformedURLException {
        driverFactory.getAndroidDriver();
        config.setBrowserMobileSettings();
    }

    @AfterEach
    public void closeBrowser(){
        config.quitDriver();
    }



    @Test
    @Order(1)
    public void testOnAndroidEmulator2() throws Exception {

        Thread.sleep(1000);
        steps.openStarbucksHomePage();
        steps.isAtMobilePage();
        Thread.sleep(2000);
        steps.clickAgree();
        Thread.sleep(2000);
        steps.clickHamburger();
        steps.clickOrderMobile();
        steps.clickAllProducts();
        Thread.sleep(5000);
        steps.clickHotCoffee();
        Thread.sleep(5000);

    }
}
