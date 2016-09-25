package newfw.admin.usermanagement;
import newfw.Dashboard;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemUsersPage extends PageBase {
    public SystemUsersPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "searchSystemUser_userName")
    WebElement txtUserName ;

    @FindBy(id = "searchSystemUser_employeeName_empName")
    WebElement txtEmployeeName ;

    @FindBy(id = "searchBtn")
    WebElement btnSearch ;

    @FindBy(id = "resetBtn")
    WebElement btnReset ;

    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    @FindBy(id = "btnDelete")
    WebElement btnDelete;

    @FindBy(id = "ohrmList_chkSelectAll")
    WebElement chkBoxSelectAll ;

    @FindBy(id = "dialogDeleteBtn")
    WebElement dialogDeleteBtn ;

    String userRole = "searchSystemUser_userType";
    String status = "searchSystemUser_status";


    public void clickSearchButton() {btnSearch.click();

    }

    public void clickResetButton(){
        btnReset.click();
    }

    public AddUserPage clickAddButton(){
        btnAdd.click();
        return getPage(AddUserPage.class);
    }

    public void clickDeleteButton(){
        btnDelete.click();
    }

    public void enterUserName(String username){
        txtUserName.sendKeys(username);
    }

    public void selectUserRole(String userRole){
        selectDropDown(this.userRole, userRole);
    }

    public void enterEmployeeName(String employeeName){
        txtEmployeeName.sendKeys(employeeName);
    }

    public void selectStatus(String status){
        selectDropDown(this.status, status);
    }

    public boolean verifyAddButton(){
        return isElementDisplayedId("btnAdd");
    }

    public void deleteUser(String user){
        enterUserName(user);
        clickSearchButton();
        selectById("ohrmList_chkSelectAll");
        btnDelete.click();
        dialogDeleteBtn.click();


    }

}
