package newfw;

import newfw.admin.job.AddNationalityPage;
import newfw.admin.job.NationalityPage;
import org.junit.Test;

public class TestAddNationalityPage extends TestBase {
    Dashboard dashboard;
    NationalityPage nationalityPage;
    AddNationalityPage addNationalityPage;


    @Test
    public void testAddNationality() {
        dashboard = loginPage.login("admin", "admin");
        nationalityPage = dashboard.goToNationalityPage();
        addNationalityPage = nationalityPage.commonItems.clickAddButton(AddNationalityPage.class);
        addNationalityPage = addNationalityPage.enternationalityName("UK");
        nationalityPage = addNationalityPage.commonItems.clickSaveButton(NationalityPage.class);
        System.out.println("Nationality added successfully");
    }
}
