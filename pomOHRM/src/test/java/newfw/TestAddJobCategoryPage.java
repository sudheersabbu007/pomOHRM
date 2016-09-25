package newfw;

import newfw.admin.job.AddJobCategoryPage;
import newfw.admin.job.JobCategoriesPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestAddJobCategoryPage extends TestBase {
    Dashboard dashboard;
    JobCategoriesPage jobCategoriesPage;
    AddJobCategoryPage addJobCategoryPage;



    @Test
    public void setAddJobCategoryPage(){
        dashboard = loginPage.login("admin","admin");
       jobCategoriesPage = dashboard.goToJobCategoriesPage();
        addJobCategoryPage = jobCategoriesPage.clickAddButton();
        addJobCategoryPage = addJobCategoryPage.addJobCategoryPage("saranya");
        jobCategoriesPage = addJobCategoryPage.commonItems.clickSaveButton(JobCategoriesPage.class);
        Assert.assertTrue(dashboard.isElementDisplayedXpath("//div[@class='message success fadable']"));
        System.out.println("Job Category Added Successfully");

    }
}
