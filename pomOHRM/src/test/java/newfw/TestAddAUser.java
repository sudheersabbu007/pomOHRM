package newfw;


import newfw.admin.usermanagement.AddUserPage;
import newfw.admin.usermanagement.SystemUsersPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestAddAUser extends TestBase {
    Dashboard dashboard;
    SystemUsersPage systemUsersPage;
    AddUserPage addUserPage;

    @Test
    public void testAddUser(){
        dashboard = loginPage.login("admin","admin");
        systemUsersPage = dashboard.goToUsersPage();
        addUserPage = systemUsersPage.clickAddButton();
        addUserPage.fillUserDetails("1","Jasmine Morgan","chikkanna","1","abc@123456","abc@123456");
        systemUsersPage = addUserPage.clickSaveButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(systemUsersPage.verifyAddButton());
        System.out.println("User added Successfully");
        driver.navigate().refresh();
        systemUsersPage.deleteUser("chikkanna");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertTrue(isElementDisplayedXpath("//div[@class='message success fadable']"));
        System.out.println("Employee Deleted Successfully" );

    }




}
