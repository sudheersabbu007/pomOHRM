package newfw;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver){this.driver = driver; }

    @FindBy(id = "txtUsername")
    WebElement txtUsername;

    @FindBy(id = "txtPassword")
     WebElement  txtPassword;

     @FindBy(id ="btnLogin" )
      WebElement btnLogin;


    public void loginbtn(){
        btnLogin.click();
    }

    public Dashboard login(String username, String password){
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        loginbtn();
        return getPage(Dashboard.class);
    }
}
