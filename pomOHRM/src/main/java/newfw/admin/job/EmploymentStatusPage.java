package newfw.admin.job;


import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmploymentStatusPage extends PageBase {
    public CommonItems commonItems;

    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    @FindBy(id = "btnDelete")
    WebElement btnDelete;

    public EmploymentStatusPage(WebDriver driver) {
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }


    public AddEmploymentStatusPage clickAddButton(){
        btnAdd.click();
        return getPage(AddEmploymentStatusPage.class);
    }

    public void clickDeleteButton(){
        btnDelete.click();
    }
}
