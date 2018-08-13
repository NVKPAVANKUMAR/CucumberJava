package driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserInstance {

    public static final String USERNAME = "nvkpavankumar2";
    public static final String AUTOMATE_KEY = "AET4cyqprWngmzYvyK8m";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
    public  static WebDriver driver;
    private static ChromeDriverService service;
    private static ChromeOptions option;

    public static WebDriver initiateDriver(String browserName) throws IOException {
        if (browserName.equalsIgnoreCase("chrome")) {
            service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File("driverJars/chromedriver.exe"))
                    .usingAnyFreePort()
                    .build();
            service.start();
            option = new ChromeOptions();
            option.addArguments("--incognito");
            return driver = new RemoteWebDriver(service.getUrl(), option);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driverJars/geckodriver.exe");
            return driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("remote")) {
            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setPlatform(Platform.WINDOWS);
            capability.setBrowserName("chrome");
            capability.setVersion("66");
            capability.setCapability("browserstack.debug", "true");
            URL browserStackUrl = new URL(URL);
            return driver = new RemoteWebDriver(browserStackUrl, capability);
        } else if (browserName.equalsIgnoreCase("EDGE")) {
            System.setProperty("webdriver.edge.driver", "driverJars/MicrosoftWebDriver.exe");
            return driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "driverJars/IEDriverServer.exe");
            return driver = new InternetExplorerDriver();
        }

        return null;
    }


    public static void openUrl(String url) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }


}
