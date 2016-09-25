package newfw.admin.job;

import newfw.CommonItems;
import newfw.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddJobTitlePage extends PageBase {

    public CommonItems commonItems;

    @FindBy(id = "jobTitle_jobTitle")
    WebElement txtJobTitle;

    @FindBy(id = "jobTitle_jobDescription")
    WebElement txtJobDescription;

    @FindBy(id = "jobTitle_note")
    WebElement txtJobNote;


    public AddJobTitlePage(WebDriver driver) {
        this.driver = driver;
        commonItems = getPage(CommonItems.class);
    }

    public void enterJobTitle(String jobTitle){
        txtJobTitle.sendKeys(jobTitle);
    }

    public void enterJobDescription(String jobDescription){
       txtJobDescription.sendKeys(jobDescription);
    }

    public void enterNote(String note){
        txtJobNote.sendKeys(note);
    }

    public AddJobTitlePage addJobTitle(String jobTitle,String jobDescription,String note){
        txtJobTitle.sendKeys(jobTitle);
        txtJobDescription.sendKeys(jobDescription);
        txtJobNote.sendKeys(note);
        return getPage(AddJobTitlePage.class);
    }



}
