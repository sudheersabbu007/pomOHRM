package newfw;

import newfw.admin.job.AddEducationPage;
import newfw.admin.job.EducationPage;
import org.junit.Test;

public class TestAddEducationPage extends TestBase  {
    Dashboard dashboard;
    EducationPage educationPage;
    AddEducationPage addEducationPage;

    @Test
    public void testAddEducationPage(){
        dashboard = loginPage.login("admin","admin");
        educationPage = dashboard.goToEducationPage();
        addEducationPage = educationPage.commonItems.clickAddButton(AddEducationPage.class);
        addEducationPage = addEducationPage.enterLevel("Engineer");
        educationPage = addEducationPage.commonItems.clickSaveButton(EducationPage.class);
        System.out.println("Level added successfully");
        educationPage.commonItems.selectSpecifiedCheckBox("Engineer");
        educationPage.commonItems.clickDeleteButton();
        System.out.println("Level deleted successfully");

    }

}


