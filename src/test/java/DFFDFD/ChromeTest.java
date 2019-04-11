package DFFDFD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class ChromeTest {

    public void firstTest123(){
       WebDriver driver = new ChromeDriver();
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
