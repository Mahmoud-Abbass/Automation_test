package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By formAuthenticationlink = By.linkText("Form Authentication");

    public LoginPage clickonFormAuthenticationLink() {
        driver.findElement(formAuthenticationlink).click();
        return new LoginPage(driver);
    }

    private By checkBoXesLink = By.linkText("Checkboxes");

    public CheckBoxes clickOnCheckBoxesLink() {
        driver.findElement(checkBoXesLink).click();
        return new CheckBoxes(driver);
    }

    private By forgotPasswordLink = By.xpath("//*[@id=\"content\"]/ul/li[20]/a");

    public ForgotPasswordPage clickOnForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }
     private By uploadFileLink = By.linkText("File Upload");

    public  FileUploaderPage clickOnUpLoadFileLink(){
     driver.findElement(uploadFileLink).click();
     return new FileUploaderPage(driver);

     }
     private By DynamicLink = By.xpath("//*[@id=\"content\"]/ul/li[14]/a");
     public DynamicLoadPage clickOnDynamicLoadPage(){
        driver.findElement(DynamicLink).click();
        return new DynamicLoadPage(driver);
     }
     private By DropDownLink =By.xpath("//*[@id=\"content\"]/ul/li[11]/a");
     public DropDownPage clickOnDropDownLink (){
         driver.findElement(DynamicLink).click();
         return new DropDownPage(driver);
     }
     private By JavaScriptAlertsLink = By.linkText("JavaScript Alerts");
     public JavaScriptPage clickOnJavaScriptAlertsLink(){
         driver.findElement(JavaScriptAlertsLink).click();
         return new JavaScriptPage(driver);
     }
   private By WYSIWYGEditorLink = By.linkText("WYSIWYG Editor");
     public  WYSIWYGEditorPage clickOnWYSIWYGEditorLink (){
         driver.findElement(WYSIWYGEditorLink).click();
         return new WYSIWYGEditorPage(driver);
     }
}


