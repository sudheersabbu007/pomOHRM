package newfw;

import newfw.admin.job.AddLicensesPage;
import newfw.admin.job.LicensesPage;
import org.junit.Test;

public class TestLicensesPage extends TestBase {
    Dashboard dashboard;
    LicensesPage licensesPage;
    AddLicensesPage addLicensesPage;

    @Test

    public void TestLicensesPage(){
        dashboard = loginPage.login("admin","admin");
        licensesPage = dashboard.goTolicensesPage();
        addLicensesPage = licensesPage.commonItems.clickAddButton(AddLicensesPage.class);
        addLicensesPage = addLicensesPage.entertxtname("Engineering");
        licensesPage = addLicensesPage.commonItems.clickSaveButton(LicensesPage.class);
        System.out.println("Licenses added successfully");
        licensesPage.commonItems.selectSpecifiedCheckBox("Engineering");
        licensesPage.commonItems.clickDeleteButton();
        System.out.println("Licenses deleted successfully");


    }
}
