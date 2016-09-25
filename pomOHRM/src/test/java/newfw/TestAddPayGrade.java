package newfw;

import newfw.admin.job.AddPayGradePage;
import newfw.admin.job.PayGradePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestAddPayGrade extends TestBase {
    Dashboard dashboard;
    PayGradePage payGradePage;
    AddPayGradePage addPayGradePage;


    @Test
    public void addPaygrade(){
        dashboard = loginPage.login("admin","admin");
        payGradePage = dashboard.goToPayGradesPage();
       addPayGradePage =  payGradePage.clickAddButton();
        addPayGradePage = addPayGradePage.addPayGradePage("sundari");
        payGradePage = addPayGradePage.commonItems.clickSaveButton(PayGradePage.class);
        Assert.assertTrue(dashboard.isElementDisplayedXpath("//div[@class='message success fadable']"));
        System.out.println("PayGrade added successfully");



    }


}
