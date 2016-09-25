package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNationalityPage extends PageBase {
    public CommonItems commonItems;

    public AddNationalityPage(WebDriver driver){
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }
    @FindBy(id = "nationality_name")
    WebElement NationalityName;

    public AddNationalityPage enternationalityName(String nationalityName){
        NationalityName.sendKeys(nationalityName);
        return getPage(AddNationalityPage.class);

    }
}
