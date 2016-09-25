package newfw.admin.job;
import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobTitlePage extends PageBase {


    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    @FindBy(id = "btnDelete")
    WebElement btnDelete;

    public JobTitlePage(WebDriver driver) {
        this.driver = driver;
    }

    public AddJobTitlePage clickAddButton(){btnAdd.click();
        return getPage(AddJobTitlePage.class);

    }

    public void clickDeleteButton(){
        btnDelete.click();
    }

    public boolean verifySuccessfulMessage(){
      return isElementDisplayedXpath("//div[@class='message success fadable']");
    }
}
