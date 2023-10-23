package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    // Mahmoud
    private final By emailField = By.id("email");
    private final By retrivePasswordButton = By.cssSelector(".icon-2x.icon-signin");
    public void  insertEmail (String email){driver.findElement(emailField).sendKeys(email);}



          public  ServerPage clickRetriveButton (){
        driver.findElement(retrivePasswordButton).click();
        return new ServerPage(driver);
          }

    }


        
