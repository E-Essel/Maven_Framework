package elearn;

import com.infinity.driverman.aDriver;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ed on 16/03/2017.
 */
public class Assertion extends aDriver {


    @Ignore
    public void staticAssertion () {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automatetillinfinity.co.uk/");

        System.out.println("LaunchURL");

        WebElement address = driver.findElement(By.xpath("html/body/div[1]/section[2]/div[1]/h3[1]"));
        address.getText();

        assertEquals("Office Address",   address.getText());

        System.out.println("" + address.getText());

    }

    @Test
    public void dynamicAssertion () throws IOException {

        baseURL();
        AsserttionTwo dyn = new AsserttionTwo(driver);

        String carousel = dyn.getDynamiWidget();
        assertEquals(carousel,dyn.getDynamiWidget());






    }
}
