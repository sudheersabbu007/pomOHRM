package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class
WorkShiftPage extends PageBase {
    public CommonItems commonItems;
    public WorkShiftPage(WebDriver driver){this.driver = driver;
    commonItems = getPage(CommonItems.class);}

    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    @FindBy(id = "btnDelete")
    WebElement btnDelete;

    public void clickAddButton(){btnAdd.click();
    }
    public void clickDeleteButton(){
        btnDelete.click();
    }




}
