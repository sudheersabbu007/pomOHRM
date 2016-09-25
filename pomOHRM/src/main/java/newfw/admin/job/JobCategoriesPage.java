package newfw.admin.job;


import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobCategoriesPage extends PageBase {

    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    @FindBy(id = "btnDelete")
    WebElement btnDelete;

    public JobCategoriesPage(WebDriver driver) {
        this.driver=driver;
    }
    public AddJobCategoryPage clickAddButton(){
        btnAdd.click();
        return getPage(AddJobCategoryPage.class);
    }
    public void clickDeleteButton(){
        btnDelete.click();
    }
}
