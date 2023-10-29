package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnteryAdLinkPage {
    WebDriver driver;
    public EnteryAdLinkPage(WebDriver driver) {
        this.driver=driver;

    }
private final By closeButton = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");
    private final By frame = By.className("modal");
public void clickOnCloseButton (){
    driver.switchTo().frame()
}
}
