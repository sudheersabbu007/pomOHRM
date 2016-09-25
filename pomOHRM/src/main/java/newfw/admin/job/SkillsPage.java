package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;

public class SkillsPage extends PageBase {
    public CommonItems commonItems;
    public SkillsPage(WebDriver driver){
        this.driver = driver;
    commonItems = getPage(CommonItems.class);
    }


}
