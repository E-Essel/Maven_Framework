package elearn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Ed on 02/03/2017.
 */
public class Annotation {

    //@BeforeClass This is a static method that runs once before @Test annotation method is executed

    //@AfterClass This also is a static method that runs once after @Test annotation method has been executed

    @BeforeClass
    public static void LaunchURL(){

        System.out.println("Loaded Yahoo Webpage");

    }

    @AfterClass
    public static void CloseBrowser(){

        System.out.println("Browser session closed");

    }

    @Test
    public void MyFirsTest(){

        System.out.println("First test executed");

    }

    @Test
    public void MySecondTest(){

        System.out.println("Second test executed");

    }

}
