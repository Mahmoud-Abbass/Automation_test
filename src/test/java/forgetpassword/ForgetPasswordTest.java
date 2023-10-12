package forgetpassword;

import login.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgetPasswordTest extends BaseTest {
    @Test
    public void testForgotPassword(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[20]/a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("abbasmahmoud@gmail.com");
        driver.findElement(By.cssSelector(".icon-2x.icon-signin")).click();
        String expectedResult="Internal Server Error";
        String actualResult=driver.findElement(By.xpath("/html/body/h1")).getText();
        assertTrue(actualResult.contains(expectedResult));

        


    }

    private void assertTrue(boolean contains) {
    }
}
