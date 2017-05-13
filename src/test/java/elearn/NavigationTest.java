package elearn;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ed on 23/02/2017.
 */
public class NavigationTest {

   WebDriver driver;

   @Test
   public void loadUrl(){

       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");

       driver = new ChromeDriver();

       driver.get("http://www.automatetillinfinity.co.uk/");

       driver.navigate().to("http://www.bbc.com");

    }

    @Test
    public void navigateTo(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://www.automatetillinfinity.co.uk/");

        String registerPage = "http://www.automatetillinfinity.co.uk/register_form.php?";

        driver.navigate().to(registerPage);


    }

    @Test
    public void navigateBack()
    {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://uk.yahoo.com/");

        String mailPage = "https://login.yahoo.com/?.src=fp&.intl=uk&.lang=en-GB&.done=https%3a//mail.yahoo.com";

        driver.navigate().to(mailPage);

        ///Thread.sleep(Long.parseLong("6000"));

        driver.navigate().back();

    }


    @Test
    public void navigateForward () {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://www.automatetillinfinity.co.uk/");

        String registerPage = "http://www.automatetillinfinity.co.uk/register_form.php?";

        driver.navigate().to(registerPage);


    }


    @Test
     public void navigaterefresh () {

        String categories = "http://www.testingexcellence.com/software-testing-articles/";

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("http://www.testingexcellence.com/");
        driver.navigate().to(categories);
        driver.navigate().refresh();
    }

    @Test
    public void loadbbc () {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");

        driver = new ChromeDriver ();
        driver.get ("http://www.bbc.co.uk/news");
       // driver.navigate().to(http://www.bbc.co.uk/news/world-us-canada-39123474);
        //Thread.sleep("6000");
        //driver.navigate().back();


    }

    @Ignore
    public void fowardFirefox () throws InterruptedException {
        String finance = "https://uk.finance.yahoo.com/";

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
       // driver.get("https://uk.yahoo.com/?p=us");
        //driver.navigate().to(finance);
        //driver.navigate().back();

        //Thread.sleep(6000);
        //driver.navigate().forward();

    }


}
