package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxes {
    WebDriver driver;
    public CheckBoxes(WebDriver driver){
        this.driver =driver;
    }
    private final By checkboxOne = By.xpath("//input['@type=checkbox'][1]");

    private final By checkboxTwo = By.xpath("//input['@type=checkbox'][2]");

    public void selectCheckBoxone (){
        driver.findElement(checkboxOne).click();
    }
    public void selectCheckBoxtwo (){
        driver.findElement(checkboxTwo).click();
    }
}
