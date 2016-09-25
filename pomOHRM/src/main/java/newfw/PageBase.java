package newfw;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class PageBase {

    public WebDriver driver;

    public WebDriver getDriver(){
        return new FirefoxDriver();
    }

    public <T> T getPage(Class<T> pageClass) {
        return PageFactory.initElements(driver, pageClass);
    }

    public void verifyTitle(String expectedTitle ){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("Title of the page is:"+actualTitle);
    }

    public void selectById(String id){
        driver.findElement(By.id(id)).click();
    }


    public void enterInTextBox(String id, String value){
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public void selectDropDown(String id,String value){
        Select dropdown = new Select(driver.findElement(By.id(id)));
        dropdown.selectByValue(value);
    }

    public boolean isElementDisplayedId(String id){
        return driver.findElement(By.id(id)).isDisplayed();
    }

    public boolean isElementDisplayedXpath(String xpath){
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public  void selectXpathDynamically(){ ////input[@type='checkbox']
        driver.findElement(By.xpath("//a[contains(.,'sada')]/../input[@type='checkbox']")).click();
    }

}
