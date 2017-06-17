package sauceLabs;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ed on 21/05/2017.
 */
public class SauceRemoteCloud {

    public static final String USERNAME = "E-Essel";
    public static final String ACCESS_KEY = "008e2de5-dfbc-4db2-82b0-3406fef0fab5";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    WebDriver driver;

    @Test

    public  void main() throws Exception {

        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("platform", "Windows 8");
        caps.setCapability("version", "10.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        /**
         * Goes to Sauce Lab's guinea-pig page and prints title
         */

        driver.get("http://www.bbc.co.uk");
        System.out.println("title of page is: " + driver.getTitle());

    }

    @Test
    public void openWebsite() throws MalformedURLException {



        driver.navigate().to("http://www.bbc.co.uk/sport");


        driver.quit();
    }
}