package DFFDFD;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class ChromeTest {
    private final static Logger LOGGER = Logger.getLogger(ChromeTest.class.getName());

    private WebDriver driver;

//    @BeforeClass
//    public static void createAndStartService() throws IOException {
//        service = new ChromeDriverService.Builder()
//                .usingPort(11107)
//                .build();
//        service.start();
//    }
//
//    @AfterClass
//    public static void createAndStopService() {
//        service.stop();
//    }
//
//    @BeforeMethod
//    public void createDriver() {
//        driver = new RemoteWebDriver(service.getUrl(),
//                DesiredCapabilities.chrome());
//    }
//
//    @AfterMethod
//    public void quitDriver() {
//        driver.quit();
//    }
    @Test
    public void firstTest123() throws MalformedURLException {
//region variant1
//        driver = new ChromeDriver();
// endregion
//        ////////////////////
//region variant2
//       DesiredCapabilities capability = DesiredCapabilities.chrome();
//       capability.setBrowserName(BrowserType.CHROME);
//       capability.setPlatform(Platform.fromString("Windows 8.1'"));
//       capability
//       capability.setVersion("73.0.3683.86");
//       WebDriver  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
// endregion
//        ////////////////////
//region variant3
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//        options.setCapability(CapabilityType.BROWSER_VERSION, "73.0.3683.86");
//        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), options);
// endregion
//        ////////////////////

//region variant3
//        ////////////////////
//        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");
// endregion
//        ////////////////////

//region variant4
//        ////////////////////
        String nameOS = "os.name";
        String systemName = System.getProperty(nameOS);
        if(systemName.contains("Windows")){
            systemName = "Windows";
        }

        String chromeDriverPath = "";
        String chromeBrowserProfile = "";
//        String chromeDriverVersion = "";
        switch (systemName){
            case "Linux" :
                chromeDriverPath = "/opt/chromedriverfolder/chromedriver";
                chromeBrowserProfile = "user-data-dir=/home/cont/.config/google-chrome";
                break;
            case "Windows":
                chromeDriverPath = "webdriver.chrome.driver=C:\\Users\\Cont\\chromedriver\\chromedriver.exe";
                chromeBrowserProfile = "user-data-dir=C:\\Users\\Cont\\AppData\\Local\\Google\\Chrome\\User Data";
//                chromeDriverVersion = "chrome.chromedriverVersion=77.0.3865.40";
                break;
        }
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        driver = new ChromeDriver();
//        LOGGER.info("before chrome");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(chromeBrowserProfile);
        options.addArguments(chromeDriverPath);
//        options.addArguments(chromeDriverVersion);

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        driver = new ChromeDriver(capabilities);
        String hubUrl  = "http://172.16.68.128:4444/wd/hub";
//        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), new ChromeOptions());
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);

//        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
//
//        String browserName = cap.getBrowserName();
//        System.out.println(browserName);
//
//
//        String v = cap.getVersion().toString();
//        System.out.println(v);

        LOGGER.info("after chrome");
//        ////////////////////
// endregion

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        LOGGER.info("maximazi");
        //asdasd
//       driver.navigate().to("http://localhost:8080/armada");
        driver.navigate().to("http://gserver.ircoc.vrn.ru/ircosweb/?p=507");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    public void firstTest123455678(){
        Assert.assertEquals(4,5);
    }
}
