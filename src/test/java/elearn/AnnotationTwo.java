package elearn;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ed on 02/03/2017.
 */
public class AnnotationTwo {

    WebDriver  driver;
    //@Before annotation runs before each @Test method is executed
    //@After annotation runs after each @Test method has been executed

    @Before
    public  void LaunchURL(){


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "src\\main\\resources\\Driver\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("http://www.bbc.co.uk/news");

         System.out.println("LaunchURL");


    }

    @Test
    public void Navigate_BBCsport (){
        System.out.println("BBCSport");

        driver.navigate().to("http://www.bbc.co.uk/sport");

    }

    @Test
    public void Navigate_BBCtech (){
        System.out.println("BBCtech");

        driver.navigate().to("http://www.bbc.co.uk/news/technology");

    }


    @After
    public  void CloseBrowser(){

        System.out.println("CloseBrowser");

        driver.close();



        //System.out.println("Browser closed");

    }

    @Ignore
    public void MyFirsTest(){

        System.out.println("My first test executed");

    }

    @Ignore
    public void MySecondTest(){


        //System.out.println("My second test executed");

    }
}
