package DFFDFD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class ChromeTest {
    private static ChromeDriverService service;
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
       DesiredCapabilities capability = DesiredCapabilities.chrome();
       WebDriver  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.navigate().to("http://localhost:8080/armada");
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
