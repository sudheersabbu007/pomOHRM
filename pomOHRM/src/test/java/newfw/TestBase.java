package newfw;


import org.junit.After;
import org.junit.Before;

public class TestBase extends PageBase {

     LoginPage loginPage;

    @Before
    public void openBrowser(){
        //System.getenv("Driver_URL");
        driver = getDriver();
        driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        loginPage=getPage(LoginPage.class);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
