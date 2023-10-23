package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage {
    WebDriver driver;
    public  DropDownPage (WebDriver driver){
        this.driver = driver;
    }
    private final By DropDownButton = By.id("dropdown");
    public void clickOnDropDownButton(){
        driver.findElement(DropDownButton).click();
    }
    private final By OptionOne = By.linkText("Option 1");
    public void clickOnOptionOne(){
        driver.findElement(OptionOne).click();
    }
    private final By ValidationSelectionOption = By.xpath("//*[@id=\"dropdown\"]/option[1]");
    public String getValidationSelectionOption (){
        return driver.findElement(ValidationSelectionOption).getText();
    }
}

