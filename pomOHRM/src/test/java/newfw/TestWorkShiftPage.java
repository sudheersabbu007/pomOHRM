package newfw;

import newfw.admin.job.AddWorkShiftPage;
import newfw.admin.job.WorkShiftPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestWorkShiftPage extends TestBase {
    Dashboard dashboard;
    WorkShiftPage workShiftPage;
    AddWorkShiftPage addWorkShiftPage;

    @Test
    public void addWorkShiftPage(){
        dashboard = loginPage.login("Admin","admin");
       workShiftPage =  dashboard.goToWorkShiftPage();
        addWorkShiftPage = workShiftPage.commonItems.clickAddButton(AddWorkShiftPage.class);
        addWorkShiftPage = addWorkShiftPage.addWorkShiftPage("EarlyMorning","06:00","15:45");
        workShiftPage = addWorkShiftPage.commonItems.clickSaveButton(WorkShiftPage.class);
        Assert.assertTrue(dashboard.isElementDisplayedXpath("//div[@class='message success fadable']"));
        System.out.println("WorkShift added successfully");
    }
}
