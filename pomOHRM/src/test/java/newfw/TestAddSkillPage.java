package newfw;

import newfw.admin.job.AddSkillPage;
import newfw.admin.job.SkillsPage;
import org.junit.Assert;
import org.junit.Test;

public class TestAddSkillPage extends TestBase {
    Dashboard dasboard;
    SkillsPage skillsPage;
    AddSkillPage addSkillPage;

    @Test
    public void testAddSkillPage() {
        dasboard = loginPage.login("admin","admin");
        skillsPage = dasboard.goToQualificationsPage();
        addSkillPage = skillsPage.commonItems.clickAddButton(AddSkillPage.class);
        addSkillPage = addSkillPage.fillAddSkillPage("sahana","hardskill");
        skillsPage = addSkillPage.commonItems.clickSaveButton(SkillsPage.class);
        Assert.assertTrue(isElementDisplayedXpath("//div[@class='message success fadable']"));
        System.out.println("Skills added successfully");
        driver.navigate().refresh();
        skillsPage.commonItems.selectSpecifiedCheckBox("sahana");
        skillsPage.commonItems.clickDeleteButton();
        System.out.println("skill deleted successfully");

    }
}
