package elearn;

import com.infinity.driverman.aDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ed on 22/03/2017.
 */
public class Locator2 extends aDriver {


   //public void textfield(String text, String text2) {
     // driver.findElement(By.cssSelector(text)).sendKeys(text2);

   //}

   @Test
   public void idfind() throws InterruptedException, IOException {
      //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
      //driver = new ChromeDriver();
      //driver.get("http://www.ebuyer.com/");
      baseURL();
      driver.manage().window().maximize();
      //WebElement menu = driver.findElement(By.id("hdr-deals"));
      //menu.click();

      //WebElement hotelDealsFinder = driver.findElement(By.cssSelector(".module-title"));
      //hotelDealsFinder.getText();
      //assertEquals("Hotel Deals Finder", hotelDealsFinder.getText());

      //System.out.println("" + hotelDealsFinder.getText());

      //textfield("#qf-1q-destination", "Stratford, London, United Kingdom");
      //textfield("#qf-1q-destination-to", "westfield hammersmith, London, United Kingdom");



      //WebElement destinationFld = driver.findElement(By.cssSelector("#qf-1q-destination"));
     // destinationFld.sendKeys("Stratford,  London, United Kingdom");

      //Thread.sleep(Long.parseLong("10000"));

      //new WebDriverWait(driver, 200).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cta cta-link"))).click();

      //WebElement closeBtn = driver.findElement(By.xpath("html/body/div[6]/table/tfoot/tr/td[2]/button"));
      //closeBtn.click();

      //Thread.sleep(Long.parseLong("10000"));

      //WebElement calenderIcon = driver.findElement(By.xpath(".//*[@id='widget-query-label-1']"));
      //calenderIcon.click();

      //WebElement dateCell = driver.findElement(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[5]/td[5]/a "));
     // dateCell.click();

      //WebElement rooms = driver.findElement(By.id("#q-rooms"));
      //rooms.click();


   }


}











