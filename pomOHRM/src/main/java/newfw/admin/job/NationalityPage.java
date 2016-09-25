package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;

public class NationalityPage extends PageBase {
    public CommonItems commonItems;
    public NationalityPage(WebDriver driver){
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }
}
