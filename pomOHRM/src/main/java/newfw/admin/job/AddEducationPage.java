package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEducationPage extends PageBase {
    public CommonItems commonItems;

    public AddEducationPage(WebDriver driver){
        this.driver = driver;
        commonItems = getPage(CommonItems.class);

    }
    @FindBy(id = "education_name")
    WebElement Level;

    public AddEducationPage enterLevel(String level){
        Level.sendKeys(level);
        return getPage(AddEducationPage.class);
    }

}
