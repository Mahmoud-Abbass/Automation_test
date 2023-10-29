package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    WebDriver driver;
    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By increaseIndentButton = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");
    private final By textArea =By.cssSelector("#tinymce");
    private final String frame = "mce_0_ifr";
    public void clickOnIncreaseIndentButton(){
        driver.findElement(increaseIndentButton).click();
    }
    private void switchToFrame(){
        driver.switchTo().frame(frame);
    }
    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
    public void insertText(String text){
        switchToFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToParent();
    }
    public void clearText(){
        switchToFrame();
        driver.findElement(textArea).clear();
        switchToParent();
    }


}
