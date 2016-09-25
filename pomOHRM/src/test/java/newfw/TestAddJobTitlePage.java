package newfw;

import newfw.admin.job.AddJobTitlePage;
import newfw.admin.job.JobTitlePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestAddJobTitlePage extends TestBase {
    Dashboard dashboard;
    JobTitlePage jobTitlePage;
    AddJobTitlePage addJobTitlePage;


    @Test
    public void testAddJobTitle(){
        dashboard = loginPage.login("admin","admin");
        jobTitlePage= dashboard.goToJobTitlePage();
        addJobTitlePage=jobTitlePage.clickAddButton();
        addJobTitlePage=addJobTitlePage.addJobTitle("Engineer","software","hello");
        jobTitlePage = addJobTitlePage.commonItems.clickSaveButton(JobTitlePage.class);
        Assert.assertTrue(jobTitlePage.verifySuccessfulMessage());
        System.out.println("Job Title added Successfully");

    }
}
