package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadPage {
    WebDriver driver;
    public DynamicLoadPage (WebDriver driver){
        this.driver= driver;
    }
    private final By example1 = By.partialLinkText("Example 1:");
    public OnePage ClickOnExampleOne (){
driver.findElement(example1).click();
    return new OnePage(driver);
    }
    private final By example2 = By.partialLinkText("Example 2");
    public TwoPage ClickOnExampleTwo (){
        driver.findElement(example2).click();
        return new TwoPage(driver);
    }
}

