package elearn;


import org.junit.*;

public class AnnotationThree {

    @BeforeClass
    public static void LaunchURL(){

        System.out.println("Loaded Yahoo Webpage");

    }

    @AfterClass
    public static void ExitBrowser(){

        System.out.println("Browser Exited");

    }

    @Before
    public  void RedirectPage(){

        System.out.println(" Yahoo webpage redirected to login page");

    }

    @After
    public  void CloseCurrentBrowserSession(){

        System.out.println("Browser session closed");}

    @Test
    public void MyFirsTest(){

        System.out.println("Test One passed");

    }

    @Test
    public void MySecondTest(){

        System.out.println("Test Two failed");}




}
