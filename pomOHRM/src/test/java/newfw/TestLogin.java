package newfw;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin extends TestBase {
    LoginPage loginPage = new LoginPage(driver);


    @Test
    public void loginOhrm()  {
        loginPage.login("admin","admin");
    }

}

