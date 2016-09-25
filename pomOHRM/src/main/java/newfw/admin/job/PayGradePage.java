package newfw.admin.job;

import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayGradePage extends PageBase {
    public PayGradePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    @FindBy(id = "btnDelete")
    WebElement btnDelete;



    public AddPayGradePage clickAddButton(){btnAdd.click();
    return getPage(AddPayGradePage.class);}
    public void clickDeleteButton(){
        btnDelete.click();
    }


}
