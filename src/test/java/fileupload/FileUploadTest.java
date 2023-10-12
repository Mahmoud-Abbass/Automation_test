package fileupload;

import login.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FileUploadTest extends BaseTest{
    @Test
    public void testFileUpload(){
        driver.findElement(By.xpath("//*[@id='content']/ul/li[18]/a")).click();
        driver.findElement(By.xpath("//*[@id='file-upload']")).sendKeys("C:/Users/DELL/Pictures/WARD.jpg");
        driver .findElement(By.xpath("//*[@id='file-submit']")).click();
        String expectedResult ="WARD.jpg";
        String actualResult = driver.findElement(By.xpath("//*[@id='uploaded-files']")).getText();
        assertTrue(actualResult.contains(expectedResult));




        }


}
