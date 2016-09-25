package newfw;

import newfw.admin.job.AddEmploymentStatusPage;
import newfw.admin.job.EmploymentStatusPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestEmploymentStatusPage extends TestBase {
    Dashboard dashboard;
    EmploymentStatusPage employmentStatusPage;
    AddEmploymentStatusPage addEmploymentStatusPage;



    @Test
    public void testEmploymentStatusPage() throws InterruptedException {
        dashboard = loginPage.login("admin","admin");
        employmentStatusPage = dashboard.gotoEmploymentStatusPage();
        addEmploymentStatusPage = employmentStatusPage.clickAddButton();
        addEmploymentStatusPage = addEmploymentStatusPage.addEmploymentStatusPage("radha");
        employmentStatusPage = employmentStatusPage.commonItems.clickSaveButton(EmploymentStatusPage.class);
        Assert.assertTrue(dashboard.isElementDisplayedXpath("//div[@class='message success fadable']"));
        System.out.println("Employment status added successfully");
        /*Thread.sleep(5000);
        addEmploymentStatusPage.commonItems.selectXpathDynamically();
        Thread.sleep(100000);*/

    }

}
