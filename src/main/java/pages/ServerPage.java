package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServerPage {
    WebDriver driver;
    public ServerPage(WebDriver driver){
        this.driver= driver;
    }
    private final By validationText = By.xpath("//h1");

    public  String getValidationText(){
        return driver.findElement(validationText).getText();
    }
    }

