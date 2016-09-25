package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmploymentStatusPage extends PageBase {
    public CommonItems commonItems;

    @FindBy(id = "empStatus_name")
    WebElement txtName;

    public AddEmploymentStatusPage(WebDriver driver) {
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }

    public AddEmploymentStatusPage addEmploymentStatusPage(String name){
        txtName.sendKeys(name);
        return getPage(AddEmploymentStatusPage.class);

    }

}
