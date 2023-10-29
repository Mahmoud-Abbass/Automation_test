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
    private final By jSConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private final By jsPromotButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    public void selectclickForJsAlertButton(){
        driver.findElement(clickForJsAlertButton).click();
    }
        public void acceptAlert(){
        driver.switchTo().alert().accept();
        }
        public void sendALertValue(String text){driver.switchTo().alert().sendKeys(text);
    }
    public void clickOkAfterSendKey(){
        driver.switchTo().alert().accept();
    }

        public void clickOnJsConfirmButton (){
        driver.findElement(jSConfirmButton).click();
        }
        public void clickOnJsPromotButton(){
        driver.findElement(jsPromotButton).click();
        }


    public String getValidationMessage() {
        return driver.findElement(validationMessage).getText();
    }



}
