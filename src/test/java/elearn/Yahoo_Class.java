package elearn;

        import org.junit.AfterClass;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ed on 05/03/2017.
 */
public class Yahoo_Class {
    static WebDriver driver;

    static String homepage = ":https://uk.yahoo.com/";
    static String Financepage = "https://uk.finance.yahoo.com/";


    @BeforeClass
    public static void LaunchYahooHomepage() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homepage);

        System.out.println(driver.getTitle().contains("Yahoo"));


    }
    @Test
    public void yahoofinance()  {
        driver.navigate().to(Financepage);

        //driver.navigate().back();

        System.out.println(driver.getTitle().contains("Yahoo Finance - Business finance, stock market, quotes, news"));

    }

    @AfterClass
    public static void  BrowserClose() {



        driver.close();
        System.out.println("close browser");
    }


}

