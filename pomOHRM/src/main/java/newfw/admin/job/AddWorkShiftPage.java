package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by KK on 23/08/2016.
 */
public class AddWorkShiftPage extends PageBase {
    public CommonItems commonItems;

    @FindBy(id = "workShift_name")
    WebElement txtname;

    String ID_WorkHoursFrom = "workShift_workHours_from";

    String ID_WorkHoursTo = "workShift_workHours_to";

    @FindBy(id = "btnSave")
    WebElement btnSave;

    @FindBy(id = "btnCancel")
    WebElement btnCancel;

    public AddWorkShiftPage(WebDriver driver) {
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }

    public AddWorkShiftPage addWorkShiftPage(String shiftname, String fromTime, String toTime){
        txtname.sendKeys(shiftname);
        selectDropDown(ID_WorkHoursFrom,fromTime);
        selectDropDown(ID_WorkHoursTo,toTime);
        return getPage(AddWorkShiftPage.class);
    }
    public void clickSaveButton(){
        btnSave.click();
    }

    public void clickCancelButton(){
        btnCancel.click();
    }
}
