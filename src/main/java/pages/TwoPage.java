package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TwoPage {
    WebDriver driver;
    WebDriverWait wait;
    public TwoPage (WebDriver driver){
        this.driver = driver;
    }
    private final By startButton = By.xpath("//*[@id=\"start\"]/button");


     public void clickOnStartButton (){ driver.findElement(startButton).click();}
    private final By validationMessage = By.id("finish");
     private final By loadingBar = By.xpath("//*[@id=\"loading\"]");
   public String getValidationMessage(){
    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    //wait.until(ExpectedConditions.visibilityOf(driver.findElement(validationMessage)));
    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
    return driver.findElement(validationMessage).getText();
}
}
