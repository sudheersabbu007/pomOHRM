package newfw.admin.usermanagement;

import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends PageBase {

    public AddUserPage(WebDriver driver) { this.driver = driver;
    }

    String ID_UserRole = "systemUser_userType";
    @FindBy(id = "systemUser_employeeName_empName")
    WebElement txtEmployeeName;

    @FindBy(id = "systemUser_userName")
            WebElement txtUserName;

    String DD_Status = "systemUser_status";

    @FindBy(id = "systemUser_password" )
    WebElement txtPassword;

    @FindBy(id = "systemUser_confirmPassword")
    WebElement txtConfirmPassword;

    @FindBy(id ="btnSave")
     WebElement txtSaveButton;

    @FindBy(id ="btnCancel")
    WebElement txtCancelButton;



    public SystemUsersPage clickSaveButton(){
        txtSaveButton.click();
        return getPage(SystemUsersPage.class);
    }

    public void clickCancelButton(){
        txtCancelButton.click();
    }


    public void selectUserRole(String userRole){
        selectDropDown(ID_UserRole,userRole);
    }

    public void enterEmployeeName(String employeeName){
        txtEmployeeName.sendKeys(employeeName);
    }

    public void enterUserName(String userName){ txtUserName.sendKeys(userName); }

    public void selectStatus(String status){
        selectDropDown(DD_Status,status);
    }

    public void enterPassword(String password){ txtPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void fillUserDetails(String userRole,String employeeName,String userName,String status,String password,String confirmPassword){
        selectUserRole(userRole);
        txtEmployeeName.sendKeys(employeeName);
        txtUserName.sendKeys(userName);
        selectStatus(status);
        txtPassword.sendKeys(password);
        txtConfirmPassword.sendKeys(confirmPassword);
    }
}
