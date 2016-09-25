package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;

public class EducationPage extends PageBase {
    public CommonItems commonItems;
    public EducationPage (WebDriver driver){
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }

}
