package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSkillPage extends PageBase {
    public CommonItems commonItems;
    public AddSkillPage(WebDriver driver){
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }
    @FindBy(id = "skill_name")
    WebElement txtName;

    @FindBy(id = "skill_description")
    WebElement txtDescription;

    public void enterName(String Name){
        txtName.sendKeys(Name);
    }

    public void enterDescription(String Description){
        txtDescription.sendKeys(Description);
    }

    public AddSkillPage fillAddSkillPage(String name,String description){
        enterName(name);
        enterDescription(description);
        return getPage(AddSkillPage.class);
    }

}
