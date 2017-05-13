package elearn;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Locators {

    WebDriver driver;

    @Test
    public void findByID() {

    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
        driver.get("https://www.ebookers.com/");

        WebElement flights = driver.findElement(By.id("tab-flight-tab"));
        flights.click();

        WebElement flightFrom = driver.findElement(By.id("flight-origin"));
        flightFrom.sendKeys("London, England, UK (LCY-London City)");

    }

    @Test
    public void findByCssSelectorByID() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebookers.com/");

        WebElement flights = driver.findElement(By.cssSelector("#tab-flight-tab"));
        flights.click();

    }

    @Test
    public void findByCssSelectorByClass() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebookers.com/");

        WebElement flights = driver.findElement(By.cssSelector(".tab-label"));
        flights.click();

    }


}
