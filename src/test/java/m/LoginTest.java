package m;

import login.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class LoginTest extends BaseTest {




    @Test(priority = 1)
    //valid login
    public void testSuccessfullyLogin(){


       driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
       driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
       driver.findElement(By.cssSelector("input[name=password]")) .sendKeys("SuperSecretPassword!");
       driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
       String expectedResult = "You logged into a secure area!";
       String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
       assertTrue(actualResult.contains(expectedResult));

    }

    //invalid name
        @Test(priority = 2)
        public void testInvalidUser(){

            driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
            driver.findElement(By.cssSelector("#username")).sendKeys("tomffsmith");
            driver.findElement(By.cssSelector("input[name=password]")) .sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
            String expectedResult = "Your username is invalid!";
            String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
            assertTrue(actualResult.contains(expectedResult));

        }
        // in valid password
            @Test(priority = 3)
            public void testInvalidPassword(){

                driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
                driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
                driver.findElement(By.cssSelector("input[name=password]")) .sendKeys("SuperScdecretPassword!");
                driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
                String expectedResult = "Your password is invalid!";
                String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
                assertTrue(actualResult.contains(expectedResult));

            }

                @Test(priority = 4)
                //empty fields
                public void testemptyfield(){

                    driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
                    driver.findElement(By.cssSelector("#username")).sendKeys(" ");
                    driver.findElement(By.cssSelector("input[name=password]")) .sendKeys(" ");
                    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
                    String expectedResult = "Your username is invalid!";
                    String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
                    assertTrue(actualResult.contains(expectedResult));

                }

}
