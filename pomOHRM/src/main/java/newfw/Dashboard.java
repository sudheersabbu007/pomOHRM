package newfw;

import newfw.admin.job.*;
import newfw.admin.usermanagement.SystemUsersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends PageBase {
    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement admin;

    @FindBy(id = "menu_admin_UserManagement")
    WebElement userManagement;

    @FindBy(id = "menu_admin_viewSystemUsers")
    WebElement systemUsers;

    @FindBy(id = "menu_admin_Job")
    WebElement job;

    @FindBy(id = "menu_admin_viewJobTitleList")
    WebElement jobTitles;

    @FindBy(id = "menu_admin_viewPayGrades")
    WebElement payGrades;

    @FindBy(id = "menu_admin_employmentStatus")
    WebElement employmentStatus;

    @FindBy(id = "menu_admin_jobCategory")
    WebElement jobCategories;

    @FindBy(id = "menu_admin_workShift")
    WebElement workShifts;

    @FindBy(id = "menu_admin_Qualifications")
    WebElement qualifications;

    @FindBy(id = "menu_admin_viewSkills")
    WebElement skills;

    @FindBy(id = "menu_admin_viewEducation")
    WebElement education;

    @FindBy(id = "menu_admin_viewLicenses")
    WebElement licenses;

    @FindBy(id = "menu_admin_nationality")
    WebElement nationality;


    public SystemUsersPage goToUsersPage(){
        admin.click();
        userManagement.click();
        systemUsers.click();
        return getPage(SystemUsersPage.class);
    }

    public JobTitlePage goToJobTitlePage(){
        admin.click();
        job.click();
        jobTitles.click();
        return getPage(JobTitlePage.class);
    }

    public PayGradePage goToPayGradesPage(){
        admin.click();
        job.click();
        payGrades.click();
        return getPage(PayGradePage.class);

    }

    public EmploymentStatusPage gotoEmploymentStatusPage(){
        admin.click();
        job.click();
        employmentStatus.click();
        return getPage(EmploymentStatusPage.class);

    }

    public JobCategoriesPage goToJobCategoriesPage(){
        admin.click();
        job.click();
        jobCategories.click();
        return getPage(JobCategoriesPage.class);
    }

    public WorkShiftPage goToWorkShiftPage(){
        admin.click();
        job.click();
        workShifts.click();
        return getPage(WorkShiftPage.class);
    }

    public SkillsPage goToQualificationsPage(){
        admin.click();
        qualifications.click();
        skills.click();
        return getPage(SkillsPage.class);

    }

    public EducationPage goToEducationPage(){
        admin.click();
        qualifications.click();
        education.click();
        return getPage(EducationPage.class);

    }

    public LicensesPage goTolicensesPage(){
        admin.click();
        qualifications.click();
        licenses.click();
        return getPage(LicensesPage.class);
    }

    public NationalityPage goToNationalityPage(){
        admin.click();
        nationality.click();
        return getPage(NationalityPage.class);
    }

}
