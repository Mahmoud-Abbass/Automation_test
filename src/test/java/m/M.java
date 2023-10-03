package m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class M {
    @Test
    //valid login
    public void t1(){
       WebDriver driver=new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/");
       driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
       driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
       driver.findElement(By.cssSelector("input[name=password]")) .sendKeys("SuperSecretPassword!");
       driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
       String expectedResult = "You logged into a secure area!";
       String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
       assertTrue(actualResult.contains(expectedResult));
       driver.quit();
    }

    //invalid name
        @Test
        public void t2(){
            WebDriver driver=new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
            driver.findElement(By.cssSelector("#username")).sendKeys("tomffsmith");
            driver.findElement(By.cssSelector("input[name=password]")) .sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
            String expectedResult = "Your username is invalid!";
            String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
            assertTrue(actualResult.contains(expectedResult));
            driver.quit();
        }
        // in valid password
            @Test
            public void t3(){
                WebDriver driver=new ChromeDriver();
                driver.get("https://the-internet.herokuapp.com/");
                driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
                driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
                driver.findElement(By.cssSelector("input[name=password]")) .sendKeys("SuperScdecretPassword!");
                driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
                String expectedResult = "Your password is invalid!";
                String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
                assertTrue(actualResult.contains(expectedResult));
                driver.quit();
            }

                @Test
                //empty fields
                public void t4(){
                    WebDriver driver=new ChromeDriver();
                    driver.get("https://the-internet.herokuapp.com/");
                    driver.findElement(By.xpath("//*[contains(text(),'Form')]")).click();
                    driver.findElement(By.cssSelector("#username")).sendKeys(" ");
                    driver.findElement(By.cssSelector("input[name=password]")) .sendKeys(" ");
                    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
                    String expectedResult = "Your username is invalid!";
                    String actualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();
                    assertTrue(actualResult.contains(expectedResult));
                    driver.quit();
                }

}
