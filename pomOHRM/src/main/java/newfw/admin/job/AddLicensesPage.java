package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddLicensesPage extends PageBase {
    public CommonItems commonItems;

    public AddLicensesPage(WebDriver driver){
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }
    @FindBy(id = "license_name")
    WebElement tbName;

    public AddLicensesPage entertxtname(String name){
        tbName.sendKeys(name);
       return getPage(AddLicensesPage.class);

    }
}

