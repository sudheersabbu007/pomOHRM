package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPayGradePage extends PageBase {
    public CommonItems commonItems;

    @FindBy(id = "payGrade_name")
    WebElement txtName;

    @FindBy(id = "btnSave")
    WebElement btnSave;

    @FindBy(id = "btnCancel")
    WebElement btnCancel ;


    public AddPayGradePage(WebDriver driver) {
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }

    public AddPayGradePage addPayGradePage(String name){
        txtName.sendKeys(name);
        return getPage(AddPayGradePage.class);

    }

    public void clickSaveButton(){
        btnSave.click();
    }

    public void clickCancelButton() {
        btnCancel.click();
    }
}
