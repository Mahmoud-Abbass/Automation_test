package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptPage{
    WebDriver driver;

    public JavaScriptPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By clickForJsAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private final By validationMessage = By.id("result");
    public void selectclickForJsAlertButton(){
        driver.findElement(clickForJsAlertButton).click();
    }
        public void acceptAlert(){
        driver.switchTo().alert().accept();
        }

    public String getValidationMessage() {
        return driver.findElement(validationMessage).getText();
    }



}
