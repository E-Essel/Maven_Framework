package elearn;

import com.infinity.driverman.aDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ed on 16/03/2017.
 */
public class AsserttionTwo extends aDriver {



    public AsserttionTwo() {


    }

    public AsserttionTwo(WebDriver driver) {

        super();
    }



    public String getDynamiWidget(){

        WebElement carousel = driver.findElement(By.cssSelector(".mc-caption"));
        carousel.getText();

        System.out.println( carousel.getText());

        return new String( carousel.getText());
    }


    public void verifyText() {


    }
}

