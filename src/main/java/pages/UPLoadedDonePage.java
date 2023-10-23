package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UPLoadedDonePage {

        WebDriver driver;
    public UPLoadedDonePage(WebDriver driver){this.driver=driver;}
private final By fileName = By.id("uploaded-files");
    public String getFileName (){
        return driver.findElement(fileName).getText();
    }

}
