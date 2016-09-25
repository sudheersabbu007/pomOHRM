package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddJobCategoryPage extends PageBase {
    public CommonItems commonItems;



    @FindBy(id="jobCategory_name")
    WebElement txtName;

    public AddJobCategoryPage(WebDriver driver) {
        this.driver = driver;
        commonItems =getPage(CommonItems.class);
    }

    public AddJobCategoryPage addJobCategoryPage(String name){
        txtName.sendKeys(name);
         return getPage(AddJobCategoryPage.class);
    }
}
