package newfw;


import newfw.admin.job.JobCategoriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonItems extends PageBase {
    public CommonItems(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id="btnSave")
    WebElement btnSave;

    @FindBy(id = "btnCancel")
     WebElement btnCancel;

    @FindBy(id = "btnAdd")
     WebElement btnAdd;

    @FindBy(id = "btnDel")
     WebElement btnDelete;


    public <T> T clickSaveButton(Class<T> pageClass) {
        btnSave.click();
        return getPage(pageClass);
    }

    public void clickCancelButton(){
        btnCancel.click();
    }

    public <T> T clickAddButton(Class<T> pageClass) {
        btnAdd.click();
        return getPage(pageClass);
           }

    public void clickDeleteButton(){
        btnDelete.click();
    }

    public void selectSpecifiedCheckBox(String entry) {
        driver.findElement(By.xpath("//a[contains(.,'"+entry+"')]/../preceding-sibling::td[1]/input[@name='chkListRecord[]']")).click();
    }



}
