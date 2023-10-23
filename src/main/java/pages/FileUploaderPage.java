package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    WebDriver driver;
    public FileUploaderPage (WebDriver driver){this.driver=driver;}
    private final By chooseFileButton = By.id("file-upload");
    private final By upLoadButton = By.id("file-submit");
    public void chooseFile (){
        driver.findElement(chooseFileButton).sendKeys("C:/Users/DELL/Pictures/WARD.jpg");
    }
    public UPLoadedDonePage uploadFile (){driver.findElement(upLoadButton).click();
    return new UPLoadedDonePage(driver);
    }

}
